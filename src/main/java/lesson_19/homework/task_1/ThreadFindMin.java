package lesson_19.homework.task_1;

public class ThreadFindMin extends Thread {
    public int[] array;
    public int value;

    ThreadFindMin(int[] array) {
        this.array = array;
        this.value = Integer.MAX_VALUE;
    }

    public void run() {
        for (int i : this.array)
            if (i < this.value)
                this.value = i;

        System.out.println("Min: " + this.value);
    }
}
