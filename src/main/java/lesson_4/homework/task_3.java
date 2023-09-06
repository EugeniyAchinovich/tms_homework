package lesson_4.homework;

import java.util.Scanner;

public class task_3 {
    public static int i_min(int[] A) {
        int min = A[0];
        int i_min = 0;

        for (int i = 0; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
                i_min = i;
            }
        }
        return i_min;
    }

    public static int i_max(int[] A) {
        int max = A[0];
        int i_max = 0;

        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
                i_max = i;
            }
        }
        return i_max;
    }
    public static void printArray(int[] A) {
        for (int i : A)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("n = ");
        n = scanner.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        System.out.print("Введённый массив: ");
        printArray(A);
        System.out.println("\ni min = " + i_min(A) + ", i max = " + i_max(A));

        for (int i = 0; i < A.length; i++)
            A[i] = -10 + (int)(Math.random() * 20);

        System.out.print("Случайный массив: ");
        printArray(A);

        System.out.println("\ni min = " + i_min(A) + ", i max = " + i_max(A));
    }
}
