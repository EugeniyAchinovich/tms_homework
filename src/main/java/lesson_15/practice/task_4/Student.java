package lesson_15.practice.task_4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<String> subjects;

    public Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return this.name + " " + this.subjects;
    }
}
