package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/ecommerce";
    private static final String USER = "postgres";
    private static final String PASS = "admin123";

    public static Connection getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("✅ PostgreSQL connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
