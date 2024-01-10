package lesson_30.practice.task_1;

public class Sun {
    private static Sun instance;

    private Sun() {
        // Приватный конструктор, чтобы предотвратить создание объектов извне класса
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    public void doSomething() {
        // Методы класса Sun
    }
}
