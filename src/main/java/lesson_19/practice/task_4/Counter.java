package lesson_19.practice.task_4;

public class Counter {
    public int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    Counter(int count) {
        this.count = count;
    }

    public void increase() {
        this.count++;
    }
}
