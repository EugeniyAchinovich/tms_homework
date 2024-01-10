package lesson_29.homework.DIP;

// Принцип инверсии зависимостей (DIP)

public class Main {
    public static void main(String[] args) {
        Logger logger = new DatabaseLogger();
        Application application = new Application(logger);
        application.doSomething();
    }
}