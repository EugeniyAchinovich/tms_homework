package lesson_17.practice;

public class task_4 {
    public static boolean isNull(String text) {
        return text == null || text.equalsIgnoreCase("null");
    }

    public static void main(String[] args) {
        String text = "sample";

        System.out.println(isNull(text));
    }
}