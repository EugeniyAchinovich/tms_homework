package lesson_17.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Введите строку: ");
        input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]{2,6}");
        Matcher matcher = pattern.matcher(input);

        System.out.print("Аббревиатуры: ");
        while (matcher.find())
            System.out.print(matcher.group() + " ");
    }
}
