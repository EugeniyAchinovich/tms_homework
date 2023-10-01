package lesson_11.practice.task_2;

public class AgeInputException extends Exception {
    private int detail;

    public AgeInputException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Error AgeInputException {details: " + detail + ", message: " + getMessage() + "} ";
    }
}
