package lesson_13.practice;

import java.util.ArrayList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        countries.add("Brazil");
        countries.add("USA");
        countries.add("Belarus");
        System.out.println(countries);

        countries.remove(2);
        countries.add(2, "Germany");
        System.out.println(countries);

        countries.remove(2);

        countries.remove("USA");

        int index = countries.indexOf("Brazil");
        System.out.println(index);

        if (countries.contains("Belarus"))
            System.out.println("Содержит");
        else
            System.out.println("Не содержит");
    }
}
