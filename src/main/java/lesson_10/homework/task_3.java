package lesson_10.homework;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];
        int averageLength = 0, summaryLength = 0;

        for (int i = 0; i < lines.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }

        for (String s : lines)
            summaryLength += s.length();

        averageLength = summaryLength / lines.length;

        for (String s : lines)
            if (s.length() < averageLength)
                System.out.println("\"" + s + "\", длина: " + s.length());
    }
}
