package lesson_10.practice;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        String c;
        c = a + b;
        System.out.println(c);
        c = a.concat(b);
        System.out.println(c);

        boolean isEqual = a.equals(b);
        boolean isEqualCaseIgnore = a.equalsIgnoreCase(b);
        System.out.println(isEqual + " " + isEqualCaseIgnore);

        String sub = a.substring(3);
        System.out.println(sub);

        System.out.println(a.length());

        System.out.println(a.indexOf("o"));

        boolean x = true;
        a += x;

        a = a.toUpperCase();

        c = b.replace("1", "%");

        c = c.trim();
        System.out.println(c);

        boolean isEmpty = a.isEmpty();
        System.out.println(isEmpty);

        String[] A = a.split(" ", 4);
        for (String s : A)
            System.out.println(s);
    }
}
