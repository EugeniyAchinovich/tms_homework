package lesson_17.practice;

public class task_2 {
    public static String replace(String text, String symbol) {
        return text.replaceAll("[a-zA-Z]", symbol);
    }

    public static void main(String[] args) {
        final String TEXT = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        System.out.println("Replaced: " + replace(TEXT, "&"));
    }
}