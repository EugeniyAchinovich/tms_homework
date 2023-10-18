package lesson_15.practice.task_3;

public class Developer {
    String name;
    int id;

    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }
}
