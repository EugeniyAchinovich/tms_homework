package lesson_11.practice.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        try {
            Person person = new Person(age);
        }
        catch (AgeInputException e) {
            System.out.println(e.toString());
        }
    }
}
