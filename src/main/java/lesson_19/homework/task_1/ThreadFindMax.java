package lesson_19.homework.task_1;

public class ThreadFindMax extends Thread {
    public int[] array;
    public int value;

    ThreadFindMax(int[] array) {
        this.array = array;
        this.value = Integer.MIN_VALUE;
    }

    public void run() {
        for (int i : this.array)
            if (i > this.value)
                this.value = i;

        System.out.println("Max: " + this.value);
    }
}
