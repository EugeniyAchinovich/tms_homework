package lesson_15.homework;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class task_1 {
    public static final int N = 20;
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(N);
        int sum = 0;

        for (int i = 0; i < N; i++)
            numbers.add(i / 2);

        numbers = numbers.stream().distinct().collect(Collectors.toList());
        numbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Сумма " + numbers + " = " + sum);
    }
}
