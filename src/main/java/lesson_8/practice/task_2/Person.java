package lesson_8.practice.task_2;

public class Person {
    String name;
    private String gender;

    Person (String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
