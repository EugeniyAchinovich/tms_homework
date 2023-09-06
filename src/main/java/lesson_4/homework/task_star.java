package lesson_4.homework;

import java.util.Scanner;

public class task_star {
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
        int[] B = new int[A.length + 1];
        int array_as_number = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        System.out.print("\nВведённый массив: ");
        printArray(A);

        for (int i = 0; i < A.length; i++)
            array_as_number += A[A.length - i - 1] * Math.pow(10, i);

        System.out.print("\nПолученное из массива число: " + array_as_number);

        array_as_number++;

        for (int i = 0; i < A.length; i++) {
            A[A.length - i - 1] = array_as_number % 10;
            array_as_number /= 10;
        }

        System.out.print("\nПолученный массив: ");
        if (array_as_number > 0) {
            B[0] = 1;
            System.arraycopy(A, 0, B, 1, A.length);
            printArray(B);
        }
        else
            printArray(A);
    }
}