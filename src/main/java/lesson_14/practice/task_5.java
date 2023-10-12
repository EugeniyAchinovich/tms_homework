package lesson_14.practice;

import java.util.function.Function;

public class task_5 {
    public static void main(String[] args) {
        int value;

        Function<Integer, String> printSignification = x -> {
            if (x > 0)
                return "положительное";
            else if (x < 0)
                return "отрицательное";
            else
                return "ноль";
        };

        value = 5;
        System.out.println("Число " + value + " - " + printSignification.apply(value));
        value = -5;
        System.out.println("Число " + value + " - " + printSignification.apply(value));
        value = 0;
        System.out.println("Число " + value + " - " + printSignification.apply(value));
    }
}
