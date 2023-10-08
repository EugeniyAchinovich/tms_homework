package lesson_12.homework.task_2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    static final String MSG_NO_FILE_FOUND = "\u001B[31mОшибка: файл по заданному пути не найден\u001B[0m";
    
    static final String MSG_INVALID_FORMAT = "неверный формат номера";
    static final String MSG_INVALID_ORDER = "неверный порядок в номере";
    static final String MSG_INVALID_LENGTH = "длина номера не равна 15";
    static final String MSG_INVALID_CHARACTERS = "номер содержит недопустимые символы";
    static final String PATH_RESOURCES = "src/main/resources/";
    static final int SERIAL_NUMBER_VALID_LENGTH = 15;
    static final int POS_DOCNUM_SUBSTR = "docnum".length();
    static final int POS_CONTACT_SUBSTR = "contact".length();

    public static String readFileToString(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));

        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static boolean containsOnlyLettersOrDigits(String number) {
        for (int i = 0; i < number.length(); i++)
            if (!Character.isLetterOrDigit(number.toCharArray()[i])
                    && number.toCharArray()[i] != '\r') // "невидимый" спецсимвол "возврат каретки" допускается
                return false;

        return true;
    }

    public static void printToFile(String path, String text) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path, true))) {
            text = text.replace("\n", "");
            text = text.replace("\r", "");
            writer.println(text);
        }
        catch (IOException e) {
            System.out.println(MSG_NO_FILE_FOUND);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // По умолчанию вводить нужно либо "documents.txt", либо "src/main/resources/documents.txt"
        System.out.print("Введите имя файла (с расширением) или абсолютный путь к нему: ");
        String input = scanner.nextLine();

        String path = input.contains("\\")? input : PATH_RESOURCES + input;
        String text = "";

        try {
            text = readFileToString(path);
        }
        catch (IOException e) {
            System.out.println(MSG_NO_FILE_FOUND);
        }

        // Разбиваем строку с полученным текстом на линии
        String[] numbers = text.split("\n");
        
        String pathValidDocuments = PATH_RESOURCES + "valid_documents.txt";
        String pathInvalidDocuments = PATH_RESOURCES + "invalid_documents.txt";

        // Очищаем файлы перед записью
        try {
            PrintWriter writer = new PrintWriter(pathValidDocuments);
            writer.print("");
            writer.close();
            writer = new PrintWriter(pathInvalidDocuments);
            writer.print("");
            writer.close();
        }
        catch (IOException e) {
            System.out.println(MSG_NO_FILE_FOUND);
        }

        for (String number : numbers) {
            if (!number.contains("docnum") && !number.contains("contact"))
                printToFile(pathInvalidDocuments,  number + " : \t" + MSG_INVALID_FORMAT);
            
            else if (!number.substring(0, POS_DOCNUM_SUBSTR).equals("docnum")
                    && !number.substring(0, POS_CONTACT_SUBSTR).equals("contact"))
                printToFile(pathInvalidDocuments, number + " : \t" + MSG_INVALID_ORDER);
            
            else if (number.length() != SERIAL_NUMBER_VALID_LENGTH)
                printToFile(pathInvalidDocuments,  number + " : \t" + MSG_INVALID_LENGTH);
            
            else if (!containsOnlyLettersOrDigits(number))
                printToFile(pathInvalidDocuments,  number + " : \t" + MSG_INVALID_CHARACTERS);
            else
                printToFile(pathValidDocuments, number);
        }
    }
}
