package lesson_20.homework.task_1;

import java.sql.*;

@SuppressWarnings("all")
public class Main {
    static final String PATH = "C:/Users/User/IdeaProjects/homework/src/main/java/lesson_20/homework/task_1/";

    public static void main(String[] args) {
        Connection connection = null;
        User user = new User();
        int id = 1;

        try {
            connection = DriverManager.getConnection("jdbc:h2:/ " + PATH + "db/stockExchange",
                    "пользователь", "пароль");

            Statement createTable = connection.createStatement();
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, username VARCHAR(50), " +
                    "email VARCHAR(100))";
            createTable.executeUpdate(createTableQuery);
            createTable.close();

            String selectQuery = "SELECT id, username, email FROM users WHERE id = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setInt(1, id);
            ResultSet result = selectStatement.executeQuery();

            if (result.next()) {
                user.setId(result.getInt("id"));
                user.setUsername(result.getString("username"));
                user.setEmail(result.getString("email"));
            }

            result.close();
            selectStatement.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

