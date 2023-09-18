package lesson_8.homework.task_2;

import java.lang.reflect.Field;

// Рефлексия
public class Main {
    public static void main(String[] args) {
        // Обработка исключений необходима, чтобы компиляция field.set(..) не вызвала ошибку
        try {
            // Создаём объект с полем color по умолчанию = "Green"
            Apple apple = new Apple();

            // Получаем необходимое для изменения поле по его названию в классе
            Field field = apple.getClass().getDeclaredField("color");

            field.setAccessible(true); // Делаем поле доступным
            System.out.println(field.get(apple));
            field.set(apple, "Red");   // Изменяем значение поля цвета на "Red"
            System.out.println(field.get(apple));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
