package lesson_4.practice;

public class task_4 {
    public static void main(String[] args) {
        int[] A = new int[12];
        int min = A[0], pos_min = 0;

        for (int i = 0; i < A.length; i++)
            A[i] = -15 + (int)(Math.random() * 31);

        for (int i = 0; i < A.length; i++)
            if (min > A[i]) {
                min = A[i];
                pos_min = i;
            }

        System.out.println("Массив: ");
        for (int i : A)
            System.out.print(i + " ");

        System.out.println("\nМинимальное значение = " + min + ", позиция " + pos_min);
    }
}