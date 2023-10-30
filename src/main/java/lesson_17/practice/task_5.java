package lesson_17.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5 {
    public static String replaceNewLine(String text) {
        Pattern pattern = Pattern.compile("(\\r|\\n)");
        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("");
    }
    
    public static void main(String[] args) {
        final String TEXT = "Hello \n world \n !!!";

        System.out.println(replaceNewLine(TEXT));
    }
}


