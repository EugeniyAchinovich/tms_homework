package lesson_5.practice;

import java.util.Random;

public class task_5 {
    public static final int SINGLE_DECK_SHIP = 1;
    public static final int TWO_DECK_SHIP = 2;
    public static final int THREE_DECK_SHIP = 3;
    public static final int QUAD_DECK_SHIP = 4;
    public static final int VERTICAL = 0;
    public static final int HORIZONTAL = 1;
    public static int[][] set_ship(int[][] field, int ship_length, int angle) {
        int x = 1, y = 1;
        Random random = new Random();
        do {
            x = random.nextInt(ship_length, field.length - ship_length);
            y = random.nextInt(ship_length, field.length - ship_length);
        } while (field[x][y] != 0
                || (field[x + ship_length][y] != 0 && field[x - ship_length][y] != 0
                && field[x][y + ship_length] != 0 && field[x][y - ship_length] != 0) );

        field[x][y] = 1;
        if (field[x + 1][y + 1] == 0)
            field[x + 1][y + 1] = 2;
        if (field[x - 1][y - 1] == 0)
            field[x - 1][y - 1] = 2;
        if (field[x + 1][y - 1] == 0)
            field[x + 1][y - 1] = 2;
        if (field[x - 1][y + 1] == 0)
            field[x - 1][y + 1] = 2;


            if (field[x + ship_length][y] == 0) {
                if (field[x][y - 1] == 0)
                    field[x][y - 1] = 2;
                if (field[x][y + 1] == 0)
                    field[x][y + 1] = 2;
                if (field[x - 1][y] == 0)
                    field[x - 1][y] = 2;

                for (int i = 0; i < ship_length; i++) {
                    field[x + i][y] = 1;
                    field[x + i][y - 1] = 2;
                    field[x + i][y + 1] = 2;
                }

                if (field[x + ship_length][y] == 0)
                    field[x + ship_length][y] = 2;
                if (field[x + ship_length][y + 1] == 0)
                    field[x + ship_length][y + 1] = 2;
                if (field[x + ship_length][y - 1] == 0)
                    field[x + ship_length][y - 1] = 2;
            }
            else if (field[x - ship_length][y] == 0) {
                if (field[x][y - 1] == 0)
                    field[x][y - 1] = 2;
                if (field[x][y + 1] == 0)
                    field[x][y + 1] = 2;
                if (field[x + 1][y] == 0)
                    field[x + 1][y] = 2;

                for (int i = 0; i < ship_length; i++) {
                    field[x - i][y] = 1;
                    field[x - i][y - 1] = 2;
                    field[x - i][y + 1] = 2;
                }

                if (field[x - ship_length][y] == 0)
                    field[x - ship_length][y] = 2;
                if (field[x - ship_length][y + 1] == 0)
                    field[x - ship_length][y + 1] = 2;
                if (field[x - ship_length][y - 1] == 0)
                    field[x - ship_length][y - 1] = 2;
            }


           else if (field[x][y + ship_length] == 0) {
                if (field[x][y - 1] == 0)
                    field[x][y - 1] = 2;
                if (field[x - 1][y] == 0)
                    field[x - 1][y] = 2;
                if (field[x + 1][y] == 0)
                    field[x + 1][y] = 2;

                for (int i = 0; i < ship_length; i++) {
                    field[x][y + i] = 1;
                    field[x - 1][y + i] = 2;
                    field[x + 1][y + i] = 2;
                }

                if (field[x][y + ship_length] == 0)
                    field[x][y + ship_length] = 2;
                if (field[x - 1][y + ship_length] == 0)
                    field[x - 1][y + ship_length] = 2;
                if (field[x + 1][y + ship_length] == 0)
                    field[x + 1][y + ship_length] = 2;
            }
            else if (field[x][y - ship_length] == 0) {
                if (field[x][y + 1] == 0)
                    field[x][y + 1] = 2;
                if (field[x - 1][y] == 0)
                    field[x - 1][y] = 2;
                if (field[x + 1][y] == 0)
                    field[x + 1][y] = 2;

                for (int i = 0; i < ship_length; i++) {
                    field[x][y - i] = 1;
                    field[x - 1][y - i] = 2;
                    field[x + 1][y - i] = 2;
                }

                if (field[x][y - ship_length] == 0)
                    field[x][y - ship_length] = 2;
                if (field[x - 1][y - ship_length] == 0)
                    field[x - 1][y - ship_length] = 2;
                if (field[x + 1][y - ship_length] == 0)
                    field[x + 1][y - ship_length] = 2;
            }



        return field;
    }

    public static void main(String[] args) {
        int n = 12;
        int[][] field = new int[n][n];

        String color;

        field = set_ship(field, QUAD_DECK_SHIP, VERTICAL);

        field = set_ship(field, THREE_DECK_SHIP, VERTICAL);
        field = set_ship(field, THREE_DECK_SHIP, HORIZONTAL);

        field = set_ship(field, TWO_DECK_SHIP, HORIZONTAL);
        field = set_ship(field, TWO_DECK_SHIP, VERTICAL);
        field = set_ship(field, TWO_DECK_SHIP, HORIZONTAL);

        field = set_ship(field, SINGLE_DECK_SHIP, HORIZONTAL);
        field = set_ship(field, SINGLE_DECK_SHIP, VERTICAL);
        field = set_ship(field, SINGLE_DECK_SHIP, HORIZONTAL);
        field = set_ship(field, SINGLE_DECK_SHIP, VERTICAL);

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                color = field[i][j] == 1? "\u001B[33m" : "\u001B[34m";
                if (field[i][j] == 2)
                        field[i][j] = 0;

                String symbol = field[i][j] == 0? "\uD83D\uDFE6" : "\uD83D\uDED1";
                System.out.print(color + symbol + " ");
            }
            System.out.println();
        }
    }
}
