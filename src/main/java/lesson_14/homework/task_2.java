package lesson_14.homework;

import java.util.function.Predicate;

public class task_2 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        int[] A = {0, 1, -5, 3, 9, 747, -55, 0, 2};

        for (int i : A)
            if (isPositive.test(i))
                System.out.println(i + " ");
    }
}
