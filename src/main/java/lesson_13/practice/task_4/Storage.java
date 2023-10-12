package lesson_13.practice.task_4;

public class Storage<E> {
    E value;

    public Storage() {

    }

    public Storage(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
