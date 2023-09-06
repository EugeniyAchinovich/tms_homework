package lesson_4.practice;

public class task_1 {
    public static void main(String[] args) {
        int[] A = new int[5];

        for (int i = 0; i < A.length; i++)
            A[i] = 1 + (int) (Math.random() * 10);

        for (int i : A)
            System.out.println(i + " ");
    }
}