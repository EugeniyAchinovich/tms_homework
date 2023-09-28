package lesson_10.practice;

@SuppressWarnings("all")
public class task_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sample");

        sb.append("XxXx");
        sb.insert(5, "y");
        sb.delete(5, 7);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
