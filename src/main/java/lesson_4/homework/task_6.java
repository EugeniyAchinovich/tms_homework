package lesson_4.homework;

import java.util.Scanner;

public class task_6 {
    public static boolean isArrayIncreasing(int[] A) {
        int current = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > current)
                current = A[i];
            else
                return false;
        }
        return true;
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

        if (isArrayIncreasing(A))
            System.out.print("\nПоследовательность возрастает");
        else
            System.out.print("\nПоследовательность не является строго возрастающей");

        for (int i = 0; i < A.length; i++)
            A[i] = -10 * (int)(Math.random() * 30);

        System.out.print("\nСлучайный массив: ");
        printArray(A);

        if (isArrayIncreasing(A))
            System.out.print("\nПоследовательность возрастает");
        else
            System.out.print("\nПоследовательность не является строго возрастающей");
    }
}
