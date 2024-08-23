package com.i2i.evrencell.oracle;
import java.sql.*;
import java.util.Properties;

public class dbHelper {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:FREE";
    private static final String USER = "C##ENES";
    private static final String PASSWORD = "123";

    public void connect() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to database");
        }catch (SQLException e) {
            System.out.println("Failed to connect to database");
        }
    }
}

