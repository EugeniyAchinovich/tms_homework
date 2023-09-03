package lesson_3;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.print("a = ");
        a = scanner.nextInt();

        if (a % 2 == 1)
            System.out.println("Число " + a + " - нечётное");
        else
            System.out.println("Число " + a + " - чётное");
    }
}