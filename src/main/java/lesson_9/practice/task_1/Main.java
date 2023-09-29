package lesson_9.practice.task_1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.draw();
        square.draw();
        triangle.draw();

        circle.erase();
        square.erase();
        triangle.erase();
    }
}
