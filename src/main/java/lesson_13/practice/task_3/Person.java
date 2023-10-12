package lesson_13.practice.task_3;

public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }
}
