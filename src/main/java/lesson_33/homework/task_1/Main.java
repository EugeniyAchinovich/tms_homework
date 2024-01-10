package lesson_33.homework.task_1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", "alice@example.com");
        User user2 = new User("Alice", "alice@example.com");
        User user3 = new User("Bob", "bob@example.com");

        System.out.println("user1.equals(user2): " + user1.equals(user2)); // Вывод: true
        System.out.println("user1.equals(user3): " + user1.equals(user3)); // Вывод: false

    }
}
