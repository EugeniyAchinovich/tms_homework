package lesson_12.practice;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Cognosce te ipsum", extractedSymbol = "";
        final String path = "C:\\Users\\User\\Desktop\\tms2.txt";

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), StandardCharsets.UTF_8))) {
            writer.write(text);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.getStackTrace();
        }

        try (Reader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(path), StandardCharsets.UTF_8))) {
            extractedSymbol = String.valueOf(reader.read()).toString();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.getStackTrace();
        }

        System.out.println("Extracted symbol: " + extractedSymbol);
    }
}
