package lesson_13.homework.task_3;

import java.util.Arrays;

public class Student {
    String name;
    String groupNumber;
    int course;
    int[] marks;

    public Student(String name, String groupNumber, int course, int[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\n" + name + ",\t\t\t " + groupNumber + ",\t курс: " + course + ",\t оценки " + Arrays.toString(marks);
    }
}
