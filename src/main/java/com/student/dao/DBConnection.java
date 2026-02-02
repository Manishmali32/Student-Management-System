package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/new_Students";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Lordvishnu@7a";

    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("❌ Database connection failed");
            e.printStackTrace();
        }

        return con;
    }

    // ✅ SELF TEST (inside same file)
    public static void main(String[] args) {

        Connection con = getConnection();

        if (con != null) {
            System.out.println("✅ PostgreSQL connected successfully");
        } else {
            System.out.println("❌ PostgreSQL connection failed");
        }
    }
}
