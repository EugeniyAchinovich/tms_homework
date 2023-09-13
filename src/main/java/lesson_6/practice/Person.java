package lesson_6.practice;

public class Person {
    public String fullName;
    public int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(String text) {
        System.out.println(this.fullName + " talk: " + text);
    }

    public void walk() {
        System.out.println(this.fullName + " walk");
    }
}
