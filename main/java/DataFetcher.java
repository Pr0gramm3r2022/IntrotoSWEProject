import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataFetcher {

    static int addq = 00123456;
    public static void fetchData(Connection conn, String sql) {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int Custid = rs.getInt("CUSTOMERID");
                String address = rs.getString("Address");
                int PhoneNumber = rs.getInt("PhoneNumber");
                System.out.println("CUSTOMERID: " + Custid + ", Address: " + addq + ", PhoneNumber: " + PhoneNumber);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching data: " + sql);
            e.printStackTrace();
        }
    }

   /* public static void main(String[] args) {
        //need to make a DatabaseConnector variable. possibe call from another class?

        Connection conn = DatabaseConnector.connect();
        if (conn != null) {
            String selectAllUsers = "SELECT id, address, and phone number FROM users;";
            fetchData(conn, selectAllUsers);
            try {
                conn.close(); // Close the connection when done
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

    public class Main {
        public static void main(String[] args) {
            // Assuming DatabaseConnector is a class with a static method connect()
            Connection conn = DatabaseConnector.connect();
            if (conn != null) {
                String selectAllUsers = "SELECT id, address, phoneNumber FROM users;"; // Corrected SQL syntax
                fetchData(conn, selectAllUsers);
                try {
                    conn.close(); // Close the connection when done
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("Failed to establish database connection.");
            }
        }

        public static void fetchData(Connection connection, String sql) {
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String address = resultSet.getString("address");
                    String phoneNumber = resultSet.getString("phoneNumber");
                    System.out.println("ID: " + id + ", Address: " + address + ", Phone: " + phoneNumber);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
