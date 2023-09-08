package lesson_5.homework;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("n = ");
        n = scanner.nextInt();
        System.out.print("m = ");
        m = scanner.nextInt();

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = i % 2 == 0? m * i + j : m + m * i - j - 1;

        for (int[] i : A) {
            for (int j : i) {
                if (j < 10)
                    System.out.print(" ");
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
