package lesson_15.practice.task_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Art", "Arctic", "Sample", "Base", "New");

        List<String> filteredStrings = lines.stream().filter(s -> s.startsWith("A")).toList();

        for (String str : filteredStrings)
            System.out.println(str);
    }
}
