package lesson_13.homework.task_2;

import java.util.LinkedList;

public class Animals {
    public LinkedList<String> names = new LinkedList<>();

    public Animals() {

    }

    public Animals(LinkedList<String> names) {
        this.names = names;
    }

    public void add(String name) {
        names.addFirst(name);
    }

    public void remove() {
        names.removeLast();
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
