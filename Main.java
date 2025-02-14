import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // MySQL connection details
        String url = "jdbc:mysql://localhost:3306/JDBC"; // Change testdb if needed
        String user = "root"; // Change to your MySQL username
        String password = "Kash@17022005"; // Enter your MySQL password

        try {
            // Connect to MySQL
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL!");

            // Close the connection
            conn.close();
            System.out.println("✅ Connection closed.");

        } catch (SQLException e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        }
    }
}