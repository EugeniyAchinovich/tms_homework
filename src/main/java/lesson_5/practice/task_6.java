package lesson_5.practice;

import java.util.Scanner;

public class task_6 {
    public static char[] reshape(char[] A) {
        for (int i = 0; i < A.length - 1; i++)
            if (A[i] == ' ') {
                for (int j = 0; j < A.length - i - 2; j++) {
                    A[A.length - j - 1] = A[A.length - j - 2];
                }
                A[i + 1] = ' ';
            }


        return A;
    }
    public static void main(String[] args) {
        char[] A = {'1', ' ', '2', ' ', '3', ',', ',', ','};

        System.out.println(reshape(A));
    }
}
