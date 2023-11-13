package lesson_19.homework.task_2;

public class ThreadSortBubble extends Thread {
    public Integer[] array;

    ThreadSortBubble(Integer[] array) {
        this.array = array;
    }
    @Override
    public void run() {
        for (int i = 0; i < this.array.length - 1; i++)
            for (int j = 0; j < this.array.length - i - 1; j++)
                if (this.array[j] > this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
    }
}
