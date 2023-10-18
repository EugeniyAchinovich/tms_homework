package lesson_15.practice.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer eugene = new Developer("Eugene", 15);
        Developer andrew = new Developer("Andrew", 8);
        Developer anton = new Developer("Anton", 135);

        List<Developer> developers = new ArrayList<>();

        developers.add(eugene);
        developers.add(andrew);
        developers.add(anton);

        List<Developer> filteredDevelopers = developers.stream().
                filter(dev -> dev.id > 15 && dev.name.startsWith("An")).toList();

        System.out.println(filteredDevelopers);
    }
}
