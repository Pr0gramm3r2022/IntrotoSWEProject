import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



try {
        Class.forName("org.sqlite.JDBC");
} catch (ClassNotFoundException e) {
        System.err.println("SQLite JDBC driver not found!");
    e.printStackTrace();
// Handle the error appropriately
}

public class DatabaseConnector {

    try {
        Class.forName("org.sqlite.JDBC");
    } catch (ClassNotFoundException e) {
        System.err.println("SQLite JDBC driver not found!");
        e.printStackTrace();
// Handle the error appropriately
    }
    private static final String DB_URL = "jdbc:sqlite:mydatabase.db"; // Replace with your database file path

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to SQLite database.");
        } catch (SQLException e) {
            System.err.println("Error connecting to SQLite database:");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        connect(); // Example of how to establish a connection
    }
}
4. Create Statements and Execute SQL Queries:

Once you have a Connection object, you can create Statement or PreparedStatement objects to execute SQL queries.

Java

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {

    public static void executeQuery(Connection conn, String sql) {
        try (Statement stmt = conn.createStatement()) {
            boolean hasResults = stmt.execute(sql);
            if (!hasResults) {
                System.out.println("Query executed successfully.");
            } else {
                // Handle result sets if the query returns data (e.g., SELECT)
            }
        } catch (SQLException e) {
            System.err.println("Error executing query: " + sql);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection conn = DatabaseConnector.connect();
        if (conn != null) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, age INTEGER);";
            executeQuery(conn, createTableSQL);
            DatabaseConnector.connect(); // Keep connection open for further use or close it
        }
    }
}


