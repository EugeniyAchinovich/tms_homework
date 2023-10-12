package lesson_14.practice;

import java.util.function.BiFunction;

public class task_4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> getLeast = (a, b) -> {
            if (a < b)
                return a;
            else if (a > b)
                return b;
            else
                return 0;
        };

        System.out.println(getLeast.apply(10, 8));
        System.out.println(getLeast.apply(3, -3));
        System.out.println(getLeast.apply(5, 5));
    }
}
