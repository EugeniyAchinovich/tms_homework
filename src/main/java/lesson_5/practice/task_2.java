package lesson_5.practice;

public class task_2 {
    public static void main(String[] args) {
        int A[][][] = new int[5][][];

        // 3D массив в форме "пирамиды"
        A[0] = new int[1][1];
        A[1] = new int[3][3];
        A[2] = new int[5][5];
        A[3] = new int[7][7];
        A[4] = new int[9][9];

        int count = 0;
        for (int[][] i : A)
            for (int[] j : i)
                for (int k : j)
                    count++;

        System.out.println("Количество = " + count);
    }
}
