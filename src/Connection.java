//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public static void main(String[] args) {

        //Database URL
        String url = "jdbc:mysql://localhost:3306/hospital";
        //Database Credential
        String username = "username";
        String password = "password";

        //Establish the connection
        try (java.sql.Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());

        }
    }
}