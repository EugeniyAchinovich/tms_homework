package lesson_13.practice.task_3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person[] person = new Person[3];

        person[0] = new Person("Eugene", 22);
        person[1] = new Person("Andrew", 23);
        person[2] = new Person("Anton", 22);

        people.add(person[0]);
        people.add(person[1]);
        people.add(person[2]);

        for (Person p : people)
            System.out.println(p);

        people.remove(person[0]);
        people.remove(person[1]);

        System.out.println(people.contains(person[1]));
    }
}
