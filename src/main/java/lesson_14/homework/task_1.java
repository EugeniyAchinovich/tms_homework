package lesson_14.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату рождения: ");
        String birthDateStr = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateStr);
        LocalDate dateHundredYearsReached = birthDate.plusYears(100);

        System.out.println("Пользователю исполнится 100 лет в " + dateHundredYearsReached);
    }
}
