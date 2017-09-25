package com.github.georgealvessilveira.jooq_extension_lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.atomic.AtomicBoolean;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.pmw.tinylog.Logger;

import com.zaxxer.hikari.HikariDataSource;

/**
 * @author Guilherme Alves Silveira.
 */
public class ConnectionFactory {

    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "admin";
    private static final String DB = "alkimya";
    private static final String URL = "jdbc:postgresql://localhost:5432/";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String DEFAULT_URL = URL + DB;
    private static final HikariDataSource DATA_SOURCE;
    private static final AtomicBoolean LOADED = new AtomicBoolean();
    
    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception ex) {
            Logger.error(ex);
            throw new RuntimeException(ex);
        }
        DATA_SOURCE = new HikariDataSource();
    }

    private static volatile String url;
    
    private static String getUrl(String databaseType, String serverName, String portNumber) {
        return String.format("jdbc:%s://%s:%d/", databaseType, serverName, Integer.parseInt(portNumber));
    }
    
    public static synchronized void load() {
        String databaseType = "postgresql";
        String serverName = "localhost";
        String portNumber = "5432";
        url = getUrl(databaseType, serverName, portNumber);
        DATA_SOURCE.addDataSourceProperty("serverName", serverName);
        DATA_SOURCE.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
        DATA_SOURCE.addDataSourceProperty("user", USER_NAME);
        DATA_SOURCE.addDataSourceProperty("password", PASSWORD);
        DATA_SOURCE.addDataSourceProperty("portNumber", portNumber);
        DATA_SOURCE.addDataSourceProperty("databaseName", DB);
        DATA_SOURCE.setConnectionTimeout(30000);
        DATA_SOURCE.setIdleTimeout(60_000);
        DATA_SOURCE.setMaxLifetime(600_000);
        DATA_SOURCE.setLeakDetectionThreshold(15000);
        DATA_SOURCE.setMaximumPoolSize(3);
        DATA_SOURCE.setPoolName("ConnectionPool");
        LOADED.set(true);
    }

    public static Connection getConnection(String database) {
        ensureLoad();
        try {
            return DriverManager.getConnection(url, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void ensureLoad() throws IllegalArgumentException {
        if (!LOADED.get()) {
            throw new IllegalArgumentException("You have to load the ConnectionFactory.");
        }
    }

    public static Connection getConnectionFromPool() {
        ensureLoad();
        try {
            return DATA_SOURCE.getConnection();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DEFAULT_URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static DSLContext getDSL() {
        return DSL.using(getConnectionFromPool(), SQLDialect.POSTGRES_9_4);
    }

    public static DSLContext getDSL(Connection con) {
        return DSL.using(con, SQLDialect.POSTGRES_9_4);
    }
}
