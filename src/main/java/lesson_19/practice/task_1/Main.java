package lesson_19.practice.task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");

        Child childThread = new Child();
        childThread.start();

        System.out.println("Поток main завершает свою работу");
    }
}
