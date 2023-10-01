package lesson_11.homework.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword;

        System.out.print("Username         : ");
        login = scanner.nextLine();
        System.out.print("Password         : ");
        password = scanner.nextLine();
        System.out.print("Confirm password : ");
        confirmPassword = scanner.nextLine();

        try {
            SignUpAssist.signUp(login, password, confirmPassword);
        }
        catch (WrongLoginException e) {
            e.printDetails();
        }
        catch (WrongPasswordException e) {
            e.printDetails();
        }
    }
}
