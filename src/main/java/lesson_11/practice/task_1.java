package lesson_11.practice;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int index = scanner.nextInt();
        int divisor = scanner.nextInt();

        try {
            A[index] /= divisor;
            System.out.println(A[index]);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
