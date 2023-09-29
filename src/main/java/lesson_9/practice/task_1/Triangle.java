package lesson_9.practice.task_1;

public final class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("I draw triangle");
    }

    @Override
    public void erase() {
        System.out.println("I erase triangle");
    }
}
