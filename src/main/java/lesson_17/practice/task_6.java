package lesson_17.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_6 {
    public static void printName(String text) {
        Pattern pattern = Pattern.compile("\\b[А-ЯЁ][а-яё]+\\b"); 
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) 
            System.out.println(matcher.group());
    }
    
    public static void main(String[] args) {
        final String TEXT = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        printName(TEXT);
    }
}

