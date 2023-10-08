package lesson_12.practice.task_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Eugene", "Computer engineering", 22);
        final String PATH = "C:\\Users\\User\\Desktop\\student.txt";

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            objectOutputStream.writeObject(student);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
