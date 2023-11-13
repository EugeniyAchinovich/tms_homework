package lesson_19.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Integer[] A = {-3, 5, 9, -12, 0, 4, 15, 9, 1, -8};
        Integer[] B = {-3, 5, 9, -12, 0, 4, 15, 9, 1, -8};
        Integer[] C = {-3, 5, 9, -12, 0, 4, 15, 9, 1, -8};

        ThreadSortBubble threadSortBubble = new ThreadSortBubble(A);
        ThreadSortInsertion threadSortInsertion = new ThreadSortInsertion(B);
        ThreadSortSelection threadSortSelection = new ThreadSortSelection(C);

        threadSortBubble.start();
        threadSortInsertion.start();
        threadSortSelection.start();

        System.out.print("Bubble sorted array    : ");
        for (Integer i : A)
            System.out.print(i + " ");

        System.out.print("\nInsertion sorted array : ");
        for (Integer i : B)
            System.out.print(i + " ");

        System.out.print("\nSelection sorted array : ");
        for (Integer i : C)
            System.out.print(i + " ");
    }
}
