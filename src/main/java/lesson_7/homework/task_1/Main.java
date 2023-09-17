package lesson_7.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        Director director = new Director();

        worker.printPosition();
        accountant.printPosition();
        director.printPosition();
    }
}
