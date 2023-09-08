package lesson_5.homework;

// Прим. Рисует цветную доску, а не просто массив из W и В
public class task_2 {
    public static void main(String[] args) {
        int n = 8;
        String[][] field = new String[n][n];

        // Вместо "W" и "B" заполняем белыми и чёрными квадратами соответственно
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                field[i][j] = (i + j) % 2 == 1? "⬛" : "⬜";

        for (int i = 0; i < n; i++) {
            String color = "\u001B[43m"; // Цвет фона консоли - жёлтый, наподобие дерева.

            for (int j = 0; j < n; j++)
                System.out.print(color + field[i][j] + "");

            color = "\u001B[0m"; // Сброс background цвета при переходе на новую строку
            System.out.println(color);
        }
    }
}
