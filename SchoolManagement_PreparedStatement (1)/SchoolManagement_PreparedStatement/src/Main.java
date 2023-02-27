import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/School", "postgres", "Global@123");
            System.out.println("PostGres connection successful !");
            Statement statement = ((Connection) connection).createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM student");
            while(result.next()) {
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}