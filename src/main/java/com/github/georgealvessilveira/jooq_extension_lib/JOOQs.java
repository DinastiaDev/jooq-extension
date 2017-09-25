package com.github.georgealvessilveira.jooq_extension_lib;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.conf.StatementType;
import org.jooq.impl.DSL;

/**
 *
 * @author Guilherme A. Silveira.
 */
public class JOOQs {

    private JOOQs() {
	// Vazio
    }

    public static DSLContext DSL() {
	Settings settings = new Settings().withStatementType(StatementType.STATIC_STATEMENT);
	return DSL.using(SQLDialect.POSTGRES_9_4, settings);
    }
}