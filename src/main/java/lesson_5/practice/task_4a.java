package lesson_5.practice;

import java.util.Scanner;

public class task_4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("n = ");
        n = scanner.nextInt();
        System.out.print("m = ");
        m = scanner.nextInt();

        int[][] A = new int[n][m];

        // Заполняем "нормально"
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = m * i + j + 1;

        // Вывод в указанном порядке
        for (int[] i : A){
            for (int j = 0; j < i.length; j++)
                System.out.print(i[A.length - j] + "\t");
            System.out.println();
        }
    }
}
