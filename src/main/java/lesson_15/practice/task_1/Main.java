package lesson_15.practice.task_1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user = new User(null);

        String userName = user.getName().orElse("DEFAULT");
        System.out.println(userName);
    }
}
