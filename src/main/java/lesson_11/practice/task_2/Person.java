package lesson_11.practice.task_2;

public class Person {
    public int age;

    public Person(int age) throws AgeInputException {
        this.age = age;

        if (this.age < 18)
            throw new AgeInputException(age, "age can not be less than 18");
    }
}
