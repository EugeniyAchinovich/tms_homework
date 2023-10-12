package lesson_13.practice.task_4;

public class Main {
    public static void main(String[] args) {
        Storage<String> name = new Storage<>("Eugene");
        Storage<Integer> number = new Storage<>(25);

        System.out.println(name.getValue());
        System.out.println(number.getValue());

        name.setValue("Andrew");
        number.setValue(-1234);

        System.out.println(name.getValue());
        System.out.println(number.getValue());
    }
}
