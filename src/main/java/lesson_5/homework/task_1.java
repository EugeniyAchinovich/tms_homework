package lesson_5.homework;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[3][3];
        int value;
        int sum = 0;

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = (int)(Math.random() * 9);

        System.out.println("Случайный массив: ");
        for (int[] i : A) {
            for (int j : i)
                System.out.print(j + "  ");
            System.out.println();
        }

        System.out.print("\nВведите число: ");
        value = scanner.nextInt();

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] += value;
                sum += A[i][j];
            }

        System.out.println("\nСумма элементов: " + sum);
    }
}
