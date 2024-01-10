package lesson_30.homework.task_4;

public class Main {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setField1("value1")
                .setField2(10)
                .build();
    }
}


