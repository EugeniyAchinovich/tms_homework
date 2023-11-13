package lesson_19.practice.task_4;

public class CounterThread implements Runnable {
    public Counter counter;

    public CounterThread() {
        counter = new Counter(0);
    }

    @Override
    public void run() {
        counter.setCount(1);
        for (int i = 0; i < 4; i++) {
            System.out.println(counter.getCount());
            counter.increase();
        }
    }
}
