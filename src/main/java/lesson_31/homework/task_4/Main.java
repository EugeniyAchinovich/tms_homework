package lesson_31.homework.task_4;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeOperation();

        context.setStrategy(new ConcreteStrategyB());
        context.executeOperation();
    }
}