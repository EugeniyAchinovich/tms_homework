package lesson_19.practice.task_3;

import lesson_19.practice.task_1.Child;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");

        Child childRunnable = new Child();
        Thread thread = new Thread(childRunnable);

        thread.start();
        try {
            thread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток main завершает свою работу");
    }
}
