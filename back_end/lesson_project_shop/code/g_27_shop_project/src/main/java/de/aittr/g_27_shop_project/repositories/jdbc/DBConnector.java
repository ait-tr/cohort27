package de.aittr.g_27_shop_project.repositories.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

    // jdbc:mysql://localhost:3306/animals?user=root&password=77777

    private static final String DB_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    private static final String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "27_shop";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "77777";

    public static Connection getConnection() {
        try {
            Class.forName(DB_DRIVER_PATH);
            String dbUrl = String.format("%s%s?user=%s&password=%s",
                    DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD);
            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}