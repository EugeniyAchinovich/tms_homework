package lesson_19.practice.task_4;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        CounterThread counterThread = new CounterThread();

        Thread t1 = new Thread(counterThread);
        Thread t2 = new Thread(counterThread);
        Thread t3 = new Thread(counterThread);
        Thread t4 = new Thread(counterThread);
        Thread t5 = new Thread(counterThread);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
