package lesson_6.homework;

public class task_1 {
    public static void main(String[] args) {
        CreditCard card_a = new CreditCard("8055 5555 7681 0514", 3000);
        CreditCard card_b = new CreditCard("4037 1287 9810 1596", 1000);
        CreditCard card_c = new CreditCard("1198 5621 7070 7763", 0);

        card_a.replenish(1000);
        card_b.replenish(40);
        card_c.chargeOff(100);

        card_a.printInfo();
        card_b.printInfo();
        card_c.printInfo();
    }
}
