package lesson_5.practice;

public class task_1 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int max = A[0][0];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = (int)(Math.random() * 30);

        for (int[] i : A)
            for (int j : i)
                if (j > max) max = j;

        System.out.println("max = " + max);
    }
}
