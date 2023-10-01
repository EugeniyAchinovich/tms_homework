package lesson_11.homework.task_1;

public class WrongPasswordException extends Exception {
    static final String FC_YELLOW = "\u001B[33m";
    static final String FC_DEFAULT = "\u001B[0m";

    public WrongPasswordException() {

    }
    public WrongPasswordException(String message) {
        super(message);
    }

    public void printDetails() {
        printStackTrace();
        System.out.println(FC_YELLOW + "Error: wrong password exception. " + getMessage() + FC_DEFAULT);
    }
}
