import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private Connection connection;
    
    public DatabaseManager() {
        try {
            // Connect to MySQL database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String getUserPreference(String userId) {
        String preference = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT preference FROM user_preferences WHERE user_id = '" + userId + "'");
            if (resultSet.next()) {
                preference = resultSet.getString("preference");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preference;
    }
    
    // Other database operations can be added here
}
