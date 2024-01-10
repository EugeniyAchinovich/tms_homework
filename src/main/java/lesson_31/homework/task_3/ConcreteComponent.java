package lesson_31.homework.task_3;

class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent: базовая операция");
    }
}
