package lesson_4.practice;

import java.util.Arrays;
import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = {0, 1, 2, -3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum;

        System.out.print("Сумма: ");
        sum = scanner.nextInt();

        int[][] pairs = new int[A.length*A.length][2];

        for (int i = 0; i < A.length; i++) {
            if (sum < 0) {
                if (Arrays.binarySearch(A, sum + i) != -1) {
                    pairs[i][0] = i;
                    pairs[i][1] = sum + i;
                }
            }
            else {
                if (Arrays.binarySearch(A, sum - i) != -1) {
                    pairs[i][0] = i;
                    pairs[i][1] = sum - i;
                }
            }
        }

        for (int i = 0; i < A.length; i++)
            if (pairs[i][0] != 0 || pairs[i][1] != 0)
                System.out.println("[" + pairs[i][0] + "][" + pairs[i][1] + "]");
    }
}
