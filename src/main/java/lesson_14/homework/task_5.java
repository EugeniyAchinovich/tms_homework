package lesson_14.homework;

import java.util.Scanner;
import java.util.function.Supplier;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        StringBuilder input = new StringBuilder(scanner.nextLine());

        Supplier<String> reverse = () -> {
            return String.valueOf(input.reverse());
        };

        System.out.println(reverse.get());
    }
}
