package lesson_4.practice;

public class task_2 {
    public static void main(String[] args) {
        String[] fruits = new String[4];

        fruits[0] = "Груша";
        fruits[1] = "Апельсин";
        fruits[2] = "Манго";
        fruits[3] = "Яблоко";

        System.out.println("[2] = " + fruits[1] + ", [4] = " + fruits[3]);
        System.out.println("Длина = " + fruits.length);

        fruits[1] = "Банан";
        System.out.println("Теперь [2] = " + fruits[1]);
    }
}