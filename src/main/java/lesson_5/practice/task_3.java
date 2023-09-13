package lesson_5.practice;

public class task_3 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int sum = 0;

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = (int)(Math.random() * 10);

        for (int i = 0; i < A.length; i++)
            sum += A[i][i];

        System.out.println("Матрица: ");
        for (int[] i : A) {
            for (int j : i)
                System.out.print(j + "  ");
            System.out.println();
        }
        System.out.println("\nСумма элементов главной диагонали = " + sum);
    }
}
