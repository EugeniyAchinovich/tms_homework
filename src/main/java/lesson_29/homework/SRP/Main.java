package lesson_29.homework.SRP;

// Принцип единственной ответственности (SRP)
public class Main {
    public static void main(String[] args) {
        DataBaseManager dbManager = new DataBaseManager();
        dbManager.connect();
        dbManager.executeQuery("SELECT * FROM users");
        dbManager.disconnect();
    }
}