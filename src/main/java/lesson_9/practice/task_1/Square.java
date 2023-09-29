package lesson_9.practice.task_1;

public final class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("I draw square");
    }

    @Override
    public void erase() {
        System.out.println("I erase square");
    }
}
