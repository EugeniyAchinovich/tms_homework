package lesson_9.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        dog.voice();
        dog.eat("grass");
        dog.eat("dogfood");

        tiger.voice();
        tiger.eat("dogfood");
        tiger.eat("meat");

        rabbit.voice();
        rabbit.eat("meat");
        rabbit.eat("grass");
    }
}
