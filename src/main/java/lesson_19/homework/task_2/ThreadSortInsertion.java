package lesson_19.homework.task_2;

public class ThreadSortInsertion extends Thread {
    public Integer[] array;

    ThreadSortInsertion(Integer[] array) {
        this.array = array;
    }
    @Override
    public void run() {
        for (int i = 1; i < this.array.length; ++i) {
            int key = this.array[i];
            int j = i - 1;

            while (j >= 0 && this.array[j] > key) {
                this.array[j + 1] = this.array[j];
                j--;
            }
            this.array[j + 1] = key;
        }
    }
}
