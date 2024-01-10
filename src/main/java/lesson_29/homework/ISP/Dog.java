package lesson_29.homework.ISP;

public class Dog implements Pet, WildAnimal {
    @Override
    public void feed() {
        System.out.println("Собаку покормили");
    }

    @Override
    public void hunt() {
        System.out.println("Собака приследует добычу");
    }
}
