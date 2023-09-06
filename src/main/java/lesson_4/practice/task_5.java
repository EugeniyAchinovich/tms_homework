package lesson_4.practice;

import java.util.Arrays;

public class task_5 {
    public static void main(String[] args) {
        int n = 15;

        int a, b;
        String example, reversed_example;
        String[] examples = new String[n];

        for (int i = 0; i < n;) {
            a = 2 + (int)(Math.random() * 8);
            b = 2 + (int)(Math.random() * 8);

            example = a + "*" + b;
            reversed_example = b + "*" + a;

            if (!Arrays.stream(examples).anyMatch(example::equals)
                    && !Arrays.stream(examples).anyMatch(reversed_example::equals)) {
                examples[i] = example;
                i++;
            }
        }

        System.out.println("Массив: ");
        for (String i : examples)
            System.out.println(i);
    }
}