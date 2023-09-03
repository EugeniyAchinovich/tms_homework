package lesson_3;

import java.util.Scanner;

public class task_star {
    public static int sum(int n) {
        if (n <= 1)
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        boolean inputIsCorrect = false;
        while (!inputIsCorrect) {
            System.out.print("Введите число (n > 0): ");
            String input = scanner.next();

            try {
                n = Integer.parseInt(input);
                inputIsCorrect = n > 0;
            }
            catch (NumberFormatException ne) {
                System.out.println("Некорректный ввод: " + ne);
            }
        }

        System.out.println("Сумма чисел от 1 до " + n + " = " + sum(n));
    }
}