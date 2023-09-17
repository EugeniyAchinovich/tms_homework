package lesson_7.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle_a = new Circle(8);
        Triangle triangle_a = new Triangle(5, 7, 5);
        Triangle triangle_b = new Triangle(3, 5, 5);
        Rectangle rectangle_a = new Rectangle(10, 5);
        Rectangle rectangle_b = new Rectangle(2, 8);

        Shape[] shapes = {rectangle_a, rectangle_b, circle_a, triangle_a, triangle_b};
        double perimeterSum = 0;

        for (Shape s : shapes)
            perimeterSum += s.getPerimeter();

        System.out.println("Суммарный периметр: " + Math.round(perimeterSum));
    }
}
