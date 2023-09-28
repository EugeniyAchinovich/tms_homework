package lesson_10.homework;

import java.util.Scanner;

public class task_2 {
    public static String[] sortLines(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];

        for (int i = 0; i < lines.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }

        String[] linesSorted = sortLines(lines);

        for (String s : linesSorted)
            System.out.println(s);
    }
}
