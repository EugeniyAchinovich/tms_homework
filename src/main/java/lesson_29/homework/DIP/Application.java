package lesson_29.homework.DIP;

public class Application {
    private final Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        // Выполнение операций
        logger.log("Сообщение о выполненной операции");
    }
}