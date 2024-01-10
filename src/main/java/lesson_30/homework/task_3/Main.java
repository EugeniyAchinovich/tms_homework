package lesson_30.homework.task_3;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();

        Product productA = creatorA.factoryMethod();
        productA.operation();

        Creator creatorB = new ConcreteCreatorB();

        Product productB = creatorB.factoryMethod();
        productB.operation();
    }
}

