package lesson_14.practice;

import java.time.LocalDate;

public class task_2 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        int daysLeftBeforeTuesday = 9 - localDate.getDayOfWeek().getValue();

        localDate = localDate.plusDays(daysLeftBeforeTuesday);

        System.out.println("Дата следующего вторника: " + localDate);
    }
}
