package lesson_19.homework.task_2;

public class ThreadSortSelection extends Thread {
    public Integer[] array;

    ThreadSortSelection(Integer[] array) {
        this.array = array;
    }
    @Override
    public void run() {
        for (int i = 0; i < this.array.length - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j < this.array.length; j++)
                if (this.array[j] < this.array[min_idx])
                    min_idx = j;

            int temp = this.array[min_idx];
            this.array[min_idx] = this.array[i];
            this.array[i] = temp;
        }
    }
}
