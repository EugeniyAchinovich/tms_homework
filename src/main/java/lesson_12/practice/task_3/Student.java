package lesson_12.practice.task_3;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String speciality;
    int age;

    Student(String name, String speciality, int age) {
        this.name = name;
    }
}
