package lesson_19.homework.task_1;

import java.util.Scanner;

public class Main {
    public static final int N = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        ThreadFindMax threadFindMax = new ThreadFindMax(A);
        ThreadFindMin threadFindMin = new ThreadFindMin(A);

        threadFindMax.setPriority(1);
        threadFindMin.setPriority(10);

        threadFindMax.start();
        threadFindMin.start();
    }
}
