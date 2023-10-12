package lesson_14.practice;

import java.util.Scanner;
import java.util.function.Predicate;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        Predicate<String> startsWithNJ = x -> x.charAt(0) == 'N' || x.charAt(0) == 'J';

        System.out.println("Строка начинается на N или J: " + startsWithNJ.test(input));
    }
}
