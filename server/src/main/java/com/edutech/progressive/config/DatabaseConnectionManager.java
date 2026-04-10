package com.edutech.progressive.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DatabaseConnectionManager {

    private static Properties props = new Properties();
    static {
        try {
            InputStream is = DatabaseConnectionManager.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties");

            props.load(is);
            Class.forName(props.getProperty("spring.datasource.driver-class-name"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                props.getProperty("spring.datasource.url"),
                props.getProperty("spring.datasource.username"),
                props.getProperty("spring.datasource.password")
        );
    }
}
