package lesson_12.homework.task_1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    static final String PATH_RESOURCES = "src/main/resources/";

    public static String readFileToString(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));

        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        String path = PATH_RESOURCES + "romeo-and-juliet.txt";
        String text = "";

        try {
            text = readFileToString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Разбиваем строку с полученным текстом на слова по пробелам, а также переносам, чёрточкам и прочим символам
        String[] words = text.split("\\s+|_|-|=|\n");

        String longestWord = words[0];
        int longestWordLength = 0;

        for (String word : words)
            if (word.length() > longestWordLength) {
                longestWord = word;
                longestWordLength = word.length();
            }

        System.out.println("Longest word: " + longestWord);
    }
}
