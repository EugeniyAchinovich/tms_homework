package lesson_15.practice.task_1;

import java.util.Optional;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
