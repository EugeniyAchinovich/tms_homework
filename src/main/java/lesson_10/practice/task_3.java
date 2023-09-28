package lesson_10.practice;

public class task_3 {
    public static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Counter Strike 1.6 AvAvAvA";

        // 1
        String[] words = s.split(" ");
        System.out.println("Слов: " + words.length);

        // 2
        String minWord = null;
        int minLength = s.length();

        for (String word : words)
            if (word.length() < minLength) {
                minWord = word;
                minLength = word.length();
            }

        System.out.println("Самое короткое слово \"" + minWord + "\" состоит из " + minLength + " символов");

        // 3
        for (String word : words)
            if (word.equals(reverse(word)))
                System.out.println(word);
    }
}
