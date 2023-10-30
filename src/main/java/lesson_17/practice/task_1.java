package lesson_17.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_1 {
    public static String extractNumbers(String text) {
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) 
            sb.append(matcher.group()).append(", ");
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String TEXT = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        System.out.println("Числа: " + extractNumbers(TEXT));
    }
}