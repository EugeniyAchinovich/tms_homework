package lesson_14.homework;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class task_4 {
    public static float USD_BYN_RATIO = 3.3f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму (BYN): ");
        String input = scanner.nextLine();

        Consumer<String> convert = str -> {
            String[] parts = str.split(" ");
            float amount = Float.parseFloat(parts[0]);
            float convertedAmount = amount / USD_BYN_RATIO;
            System.out.println("Сумма в долларах: $" + convertedAmount);
        };

        convert.accept(input);
    }
}
