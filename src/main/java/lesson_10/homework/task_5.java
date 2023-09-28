package lesson_10.homework;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.print("Введите строку: ");
        line = scanner.nextLine();

        char[] lineDoubleSymbols = new char[line.length() * 2];
        for (int i = 0; i < lineDoubleSymbols.length; i += 2)
            lineDoubleSymbols[i] = lineDoubleSymbols[i + 1] = line.charAt(i / 2);

        System.out.println(lineDoubleSymbols);
    }
}
