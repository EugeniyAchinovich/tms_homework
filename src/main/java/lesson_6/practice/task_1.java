package lesson_6.practice;

public class task_1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(9, 6));
        System.out.println(calculator.dec(10, 5));
        System.out.println(calculator.mul(3, 3));
        System.out.println(calculator.div(10, 2));

        System.out.println("weight : " + calculator.weight);
        System.out.println("cost   : " + calculator.cost);
        System.out.println("color  : " + calculator.color);

        Calculator calculator1 = new Calculator(200, 75.6f, "gray");
        calculator1.printSpecs();
    }
}
