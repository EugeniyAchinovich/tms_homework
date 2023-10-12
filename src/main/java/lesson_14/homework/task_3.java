package lesson_14.homework;

import java.util.Scanner;
import java.util.function.Function;

public class task_3 {
    public static float USD_BYN_RATIO = 3.3f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму (BYN): ");
        String input = scanner.nextLine();

        Function<String, Float> convert = x -> Float.parseFloat(x) / USD_BYN_RATIO;

        System.out.println("В долларах: $" + Math.round(convert.apply(input)));
    }
}
