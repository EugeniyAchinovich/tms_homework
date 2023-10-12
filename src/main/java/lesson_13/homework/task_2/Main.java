package lesson_13.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();

        animals.add("Cheetah");
        animals.add("Rhino");
        animals.add("Crocodile");
        animals.add("Elephant");
        animals.add("Chimp");

        System.out.println(animals);

        animals.remove();
        animals.remove();

        System.out.println(animals);
    }
}
