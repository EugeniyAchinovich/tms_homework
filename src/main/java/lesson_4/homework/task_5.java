package lesson_4.homework;

import java.util.Scanner;

public class task_5 {
    public static int[] swapArray(int[] A) {
        for (int i = 0; i < A.length / 2; i++) {
            int temp = A[i];
            A[i] = A[A.length - i - 1];
            A[A.length - i - 1] = temp;
        }
        return A;
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

        System.out.print("\nВведённый массив: ");
        printArray(A);

        System.out.print("\nПолученный массив: ");
        printArray(swapArray(A));

        for (int i = 0; i < A.length; i++)
            A[i] = (int)(Math.random() * 9);

        System.out.print("\nСлучайный массив: ");
        printArray(A);

        System.out.print("\nПолученный массив: ");
        printArray(swapArray(A));
    }
}
