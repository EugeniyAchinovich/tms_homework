package lesson_9.practice.task_1;

public final class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("I draw circle");
    }

    @Override
    public void erase() {
        System.out.println("I erase circle");
    }
}
