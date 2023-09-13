package lesson_6.practice;

public class Calculator {
    public int weight = 100;
    public float cost = 50;
    public String color = "black";

    public Calculator() {

    }

    public Calculator(int weight, float cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    public double sum(double a, double b) {
        return a + b;
    }
    public double dec(double a, double b) {
        return a - b;
    }
    public double mul(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        return a / b;
    }

    public void printSpecs() {
        System.out.println("weight : " + this.weight);
        System.out.println("cost   : " + this.cost);
        System.out.println("color  : " + this.color);
    }
}
