package lesson_4.practice;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value, position;
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] B = new int[A.length + 1];

        System.out.print("Значение: ");
        value = scanner.nextInt();
        System.out.print("Позиция: ");
        position = scanner.nextInt();

        System.arraycopy(A, 0,  B, 0, position);
        B[position] = value;
        System.arraycopy(A, position,  B, position + 1, A.length - position);

        System.out.println("Конечный массив: ");
        for (int i : B)
            System.out.print(i + " ");
    }
}