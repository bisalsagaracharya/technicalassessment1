import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataBaseConnectionTest {

    @Test
    public void testDatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Admin@123");
            assertNotNull("Connection should not be null", connection);
            assertFalse("Auto commit should be false", connection.getAutoCommit());
            connection.rollback();
        } catch (SQLException e) {
            fail("Could not connect to the database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            fail("Could not load the MySQL JDBC driver: " + e.getMessage());
        }
    }


}
