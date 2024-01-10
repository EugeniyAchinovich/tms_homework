package lesson_30.practice.task_2;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }
}
