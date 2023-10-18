package lesson_15.practice.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student eugene = new Student("Eugene", Arrays.asList("Math", "Physics", "English"));
        Student andrew = new Student("Andrew", Arrays.asList("Biology", "Chemistry", "English"));
        Student anton = new Student("Anton", Arrays.asList("Russian", "History", "English"));

        Stream<Student> filteredStudents = Stream.of(eugene, andrew, anton);
        filteredStudents.forEach(System.out::println);
    }
}
