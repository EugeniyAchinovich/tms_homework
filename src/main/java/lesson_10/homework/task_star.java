package lesson_10.homework;

import java.util.Scanner;

public class task_star {
    public static boolean isPalindrome(final String word) {

        for (int i = 0; i < word.length() / 2; i++)
            if (word.toCharArray()[i] != word.toCharArray()[word.length() - i - 1])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int index;

        System.out.print("Введите строку: ");
        line = scanner.nextLine();
        String[] words = line.split(" ");

        // Если индекс выходит за границы массива слов, то просим ввести его заного
        do {
            System.out.print("Введите номер слова: ");
            index = scanner.nextInt();
        } while (index > words.length);

        if (isPalindrome(words[index - 1]))
            System.out.println("Слово \"" + words[index - 1] + "\" является палиндромом");
        else
            System.out.println("Слово \"" + words[index - 1] + "\" не является палиндромом");
    }
}
