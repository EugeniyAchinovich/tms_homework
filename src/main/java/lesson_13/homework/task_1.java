package lesson_13.homework;

import java.util.HashSet;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        HashSet<Integer> numbers = new HashSet<>();

        for (char c : input.toCharArray())
            if (Character.isDigit(c))
                numbers.add((int)c - '0');

        System.out.println(numbers);
    }
}
