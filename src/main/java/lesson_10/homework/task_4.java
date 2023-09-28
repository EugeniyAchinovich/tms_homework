package lesson_10.homework;

import java.util.Scanner;

public class task_4 {
    static final int ASCII_TABLE_SIZE = Character.MAX_VALUE;

    public static boolean isSymbolUnique(String word) {
        int[] letters = new int[ASCII_TABLE_SIZE];

        for (char letter : word.toCharArray()) {
            if (letters[letter] > 0)
                return false;
            letters[letter] += 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 3;
        String[] lines = new String[n];
        String[][] words = new String[n][];

        for (int i = 0; i < lines.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }

        for (int i = 0; i < lines.length; i++)
            words[i] = lines[i].split(" ");

        boolean firstWordIsFound = false;
        for (String[] line : words)
            for (String word : line)
                if (isSymbolUnique(word) && !firstWordIsFound) {
                    System.out.println("Первое слово из уникальных символов: " + word);
                    firstWordIsFound = true;
                }

    }
}
