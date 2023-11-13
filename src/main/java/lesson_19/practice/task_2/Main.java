package lesson_19.practice.task_2;

import lesson_19.practice.task_1.Child;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");

        lesson_19.practice.task_1.Child childThread = new Child();

        childThread.start();
        try {
            childThread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток main завершает свою работу");
    }
}
