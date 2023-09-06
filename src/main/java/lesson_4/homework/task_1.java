package lesson_4.homework;

import java.util.Scanner;

public class task_1 {
    public static void printArray(int[] A, boolean reverse) {
        if (!reverse)
            for (int i : A)
                System.out.print(i + " ");
        else
            for (int i = 0; i < A.length; i++)
                System.out.print(A[A.length - i - 1] + " ");
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

        System.out.println("\n = Введённые значения = ");
        System.out.println("\nПрямой порядок: ");
        printArray(A, false);
        System.out.println("\nОбратный порядок: ");
        printArray(A, true);

        for (int i = 0; i < A.length; i++)
            A[i] = 1 + (int)(Math.random() * 10);

        System.out.println("\n\n = Случайные значения = ");
        System.out.println("\nПрямой порядок: ");
        printArray(A, false);
        System.out.println("\nОбратный порядок: ");
        printArray(A, true);
    }
}
