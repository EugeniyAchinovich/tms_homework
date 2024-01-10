package lesson_30.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setValue(0xDEADFACE);
        int value = singleton.getValue();

        System.out.println(value);
    }
}