package lesson_15.homework;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class task_2 {
    public static void main(String[] args) {
        Map<Integer, String> person = new HashMap<>();

        person.put(1, "Eugene");
        person.put(2, "Alice");
        person.put(3, "John");
        person.put(4, "Olivia");
        person.put(5, "Michael");
        person.put(6, "Sophia");
        person.put(7, "David");
        person.put(8, "Emma");
        person.put(9, "Daniel");
        person.put(10, "Ava");
        person.put(11, "Alexander");
        person.put(12, "Mia");
        person.put(13, "Jacob");
        person.put(14, "Isabella");
        person.put(15, "Matthew");
        person.put(16, "Emily");
        person.put(17, "James");
        person.put(18, "Charlotte");
        person.put(19, "Benjamin");
        person.put(20, "Amelia");
        person.put(21, "William");

        List<String> filteredPerson = person.entrySet().stream()
                .filter(entry -> List.of(1, 2, 5, 8, 9, 13).contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString()).toList();

        System.out.println(filteredPerson);
    }
}
