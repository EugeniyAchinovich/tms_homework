package lesson_29.homework.LSP;


// Принцип подстановки Барбары Лисков (LSP)
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(4);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
