package lesson_5.practice;

import java.util.Scanner;

public class task_4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("n = ");
        n = scanner.nextInt();

        int[][] A = new int[n][n];

        // Заполняем "нормально"
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = A.length * i + j + 1;

        // Вывод в указанном порядке
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++)
                System.out.print(A[j][i] + "  ");
            System.out.println();
        }
    }
}
