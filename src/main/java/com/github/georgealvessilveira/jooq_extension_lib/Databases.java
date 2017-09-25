package com.github.georgealvessilveira.jooq_extension_lib;

import java.sql.Connection;
import java.util.function.Consumer;

import org.jooq.DSLContext;

/**
 * @author Guilherme Alves Silveira.
 */
public final class Databases {

    private static final Consumer<Throwable> ACAO_PRINT_STACKTRACE = throwable -> {
	throwable.printStackTrace();
	throw new RuntimeException(throwable);
    };

    private Databases() {
	throw new IllegalArgumentException("Sem Databases pra você!");
    }

    public static void open(Consumer<DSLContext> block) {
	open(block, ACAO_PRINT_STACKTRACE);
    }

    /**
     * Metodo para fazer transações, para ser utilizado com interfaces
     * funcionais.
     * 
     * @param block
     */
    public static void transaction(Consumer<DSLContext> block) {
	transaction(block, ACAO_PRINT_STACKTRACE, ACAO_PRINT_STACKTRACE);
    }

    public static void transaction(Consumer<DSLContext> block, Consumer<? super Throwable> falha) {
	transaction(block, falha, falha);
    }

    public static void open(Consumer<DSLContext> block, Consumer<? super Throwable> falha) {
	try (Connection con = ConnectionFactory.getConnectionFromPool()) {
	    DSLContext dsl = ConnectionFactory.getDSL(con);
	    block.accept(dsl);
	} catch (Throwable th) {
	    falha.accept(th);
	}
    }

    public static void transaction(Consumer<DSLContext> block, Consumer<? super Throwable> blockRollback,
	    Consumer<? super Throwable> falha) {
	try (Connection con = ConnectionFactory.getConnectionFromPool()) {
	    con.setAutoCommit(false);
	    DSLContext dsl = ConnectionFactory.getDSL(con);
	    try {
		block.accept(dsl);
		con.commit();
	    } catch (Throwable inner) {
		con.rollback();
		blockRollback.accept(inner);
		return;
	    }
	} catch (Throwable ex) {
	    falha.accept(ex);
	}
    }
}
