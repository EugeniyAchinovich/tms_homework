package lesson_29.homework.OCP;

// Принцип открытости/закрытости (OCP)
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(4);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Square Area: " + square.area());
    }
}
