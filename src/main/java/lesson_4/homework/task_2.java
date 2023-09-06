package lesson_4.homework;

import java.util.Arrays;
import java.util.Scanner;

public class task_2 {
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

        // Нахождение min & max. Способ 1: перебор вручную
        int min = A[0], max = A[0];
        for (int i : A) {
            if (min > i) min = i;
            if (max < i) max = i;
        }

        System.out.print("Введённый массив: ");
        printArray(A);
        System.out.println("\nmin = " + min + ", max = " + max);

        for (int i = 0; i < A.length; i++)
            A[i] = -5 + (int)(Math.random() * 15);

        System.out.print("Случайный массив: ");
        printArray(A);

        // Нахождение min & max. Способ 2: отсортировать с помощью sort()
        Arrays.sort(A);
        min = A[0];
        max = A[A.length -1];

        System.out.println("\nmin = " + min + ", max = " + max);
    }
}
