package lesson_17.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3 {
    public static String getInstagramNickname(String text) {
        Pattern pattern = Pattern.compile("@(\\w+)");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find())
            return "@" + matcher.group(1);
         else
            return "";
    }

    public static void main(String[] args) {
        final String TEXT = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        System.out.println("Instagram: " + getInstagramNickname(TEXT));
    }
}


