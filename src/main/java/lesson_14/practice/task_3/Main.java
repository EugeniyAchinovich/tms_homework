package lesson_14.practice.task_3;

public class Main {
    public static void main(String[] args) {
        IShape squareOfRectangle = (a, b) -> a * b;
        IShape squareOfTriangle = (a, h) -> 0.5 * a * h;

        System.out.println("Площадь прямоугольника : " + squareOfRectangle.getSquare(5, 7));
        System.out.println("Площадь треугольника   : " + squareOfTriangle.getSquare(4, 5));
    }
}
