package lesson_11.task_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        // Загрузка драйвера JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");

// Использование драйвера для создания подключения
        String url = "jdbc:mysql://localhost:3306/db_name";
        String username = "username";
        String password = "password";
        Connection connection = DriverManager.getConnection(url, username, password);


        try {
            // Создание модели таблицы в базе данных (users)
            try (PreparedStatement createTableStatement = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, username VARCHAR(50), email VARCHAR(100))")) {
                createTableStatement.executeUpdate();
            }

            // Создание модели пользователя в Java (User)
            // ... (код класса User)

            // Вытягивание информации о пользователе с помощью JDBC с id=1 и распарсинг данных
            try (PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?")) {
                selectStatement.setInt(1, 1);

                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String _username = resultSet.getString("username");
                        String email = resultSet.getString("email");
                        User user = new User();
                        user.setId(id);
                        user.setUsername(_username);
                        user.setEmail(email);

                        // Использование объекта User
                        System.out.println("User ID: " + user.getId());
                        System.out.println("Username: " + user.getUsername());
                        System.out.println("Email: " + user.getEmail());
                    } else {
                        System.out.println("Пользователь с указанным id не найден");
                    }
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
