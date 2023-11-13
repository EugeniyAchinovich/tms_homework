package lesson_19.practice.task_3;

public class Child implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println(i);
    }
}
