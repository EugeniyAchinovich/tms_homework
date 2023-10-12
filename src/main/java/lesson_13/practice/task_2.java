package lesson_13.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();

        countries.addFirst("France");
        countries.addFirst("Spain");
        countries.addLast("China");
        countries.addLast("India");
        System.out.println(countries);

        countries.removeFirst();
        countries.removeLast();
        System.out.println(countries);

        String countryA = countries.getFirst();
        String countryB = countries.getLast();
        System.out.println(countryA + " " + countryB);
    }
}
