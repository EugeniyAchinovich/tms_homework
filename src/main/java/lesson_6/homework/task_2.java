package lesson_6.homework;

public class task_2 {
    public static void main(String[] args) {
        ATM atm = new ATM(100, 100, 100);

        // Пробуем снять суммы от 0 до 500.
        for (int i = 0; i <= 50; i++) {
            System.out.print("Сумма: " + i * 10);
            atm.chargeOff(i * 10);
        }

        // Суммы 0, 10, 30 вывести не получится
        // На сумме 430 банкомат сообщает о нехватки купюр и отказывает в выдаче средств
        atm.replenish(100, 500, 500); // Пополняем банкомат
        System.out.println("\n * * * Банкомат пополнен * * * \n");

        // Теперь купюр хватает. Выводим суммы от 430 до 1000.
        for (int i = 43; i <= 100; i++) {
            System.out.print("Сумма: " + i * 10);
            atm.chargeOff(i * 10);
        }
    }
}
