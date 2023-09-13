package lesson_6.practice;

public class task_2 {
    public static void main(String[] args) {
        Person Eugene = new Person("Евгений", 22);
        Person Andrew = new Person();

        Andrew.fullName = "Андрей";
        Andrew.age = 23;

        Eugene.talk("привет");
        Andrew.walk();
    }
}
