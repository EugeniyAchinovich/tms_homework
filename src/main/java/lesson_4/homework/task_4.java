package lesson_4.homework;

import java.util.Scanner;

public class task_4 {
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

        int zero_elements_count = 0;
        String msg_result;

        for (int i : A)
            if (i == 0) zero_elements_count++;

        System.out.print("Введённый массив: ");
        printArray(A);

        msg_result = zero_elements_count > 0? Integer.toString(zero_elements_count) : "нет";
        System.out.print("\nНулевых элементов: " + msg_result);

        for (int i = 0; i < A.length; i++)
            A[i] = (int)(Math.random() * 2);

        zero_elements_count = 0;
        for (int i : A)
            if (i == 0) zero_elements_count++;

        System.out.print("\nСлучайный массив: ");
        printArray(A);

        msg_result = zero_elements_count > 0? Integer.toString(zero_elements_count) : "нет";
        System.out.print("\nНулевых элементов: " + msg_result);
    }
}
