package lesson_10.homework;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];

        for (int i = 0; i < lines.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }


        String maxLine = lines[0], minLine = lines[0];
        int maxLength = 0, minLength = Integer.MAX_VALUE;

        for (String s : lines) {
            if (s.length() > maxLength) {
                maxLine = s;
                maxLength = s.length();
            }
            if (s.length() < minLength) {
                minLine = s;
                minLength = s.length();
            }
        }

        System.out.println("Самая длинная строка  : " + maxLine + ". Символов: " + maxLength);
        System.out.println("Самая короткая строка : " + minLine + ". Символов: " + minLength);
    }
}
