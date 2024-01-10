package lesson_30.homework.task_3;

abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.operation();
    }
}
