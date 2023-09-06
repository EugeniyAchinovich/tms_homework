package lesson_4.practice;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Размер массива: ");
        n = scanner.nextInt();

        double[] masDouble = new double[n];

        for (int i = 0; i < masDouble.length; i++)
            masDouble[i] = 1 + Math.random() * 10;

        for (int i = 0; i < masDouble.length; i++)
            if (i % 2 == 0)
                masDouble[i] *= masDouble[i];

        System.out.println("Конечный массив: ");
        for (double i : masDouble)
            System.out.print(i + " ");

        System.out.println("\nКонечный массив (обратный вывод): ");
        for (int i = 0; i < masDouble.length; i++)
            System.out.print(masDouble[masDouble.length - i - 1] + " ");
    }
}