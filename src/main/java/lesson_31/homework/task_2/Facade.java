package lesson_31.homework.task_2;

class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    void operation() {
        System.out.println("Facade: операция, делегирующая к подсистемам");
        subsystem1.operation1();
        subsystem2.operation2();
        // Другие вызовы методов подсистемы, если необходимо
    }
}
