package lesson_11.homework.task_1;

public class SignUpAssist {
    public static boolean signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        boolean passwordContainsDigit = false;

        for (char symbol : password.toCharArray()) {
            if (symbol >= '0' && symbol <= '9') {
                passwordContainsDigit = true;
                break;
            }
        }

        if (login.length() >= 20)
            throw new WrongLoginException("Username length can not be more than 20.");

        if (login.contains(" "))
            throw new WrongLoginException("Username can not contain blank spaces.");

        if (password.length() >= 20)
            throw new WrongLoginException("Password length can not be more than 20.");

        if (password.contains(" "))
            throw new WrongLoginException("Password can not contain blank spaces.");

        if (!passwordContainsDigit)
            throw new WrongPasswordException("Password must contain at least 1 digit.");

        if (!password.equals(confirmPassword))
            throw new WrongLoginException("Password is not confirmed.");


        return true;
    }
}
