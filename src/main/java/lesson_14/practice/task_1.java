package lesson_14.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату: ");
        String dateStr = scanner.nextLine();

        LocalDate localDate = LocalDate.parse(dateStr);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.println("День недели: " + dayOfWeek);
    }
}
