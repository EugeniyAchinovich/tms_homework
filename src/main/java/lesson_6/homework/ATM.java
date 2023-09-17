package lesson_6.homework;

public class ATM {
    public int notes_100;
    public int notes_50;
    public int notes_20;

    public ATM(int notes_100, int notes_50, int notes_20) {
        this.notes_100 = notes_100;
        this.notes_50 = notes_50;
        this.notes_20 = notes_20;
    }
    // пополнить
    public void replenish(int notes_100, int notes_50, int notes_20) {
        this.notes_100 += notes_100;
        this.notes_50 += notes_50;
        this.notes_20 += notes_20;
    }
    // снять
    public boolean chargeOff(int amount) {
        final String  MSG_LACK_OF_NOTES = "\t. Операция не может быть выполнена: необходима инкассация.";
        String MSG_WRONG_REQUEST = "\t. Операция не может быть выполнена: некорректно введена сумма.";

        String FG_BLUE = "\u001B[34m";
        String FG_RED = "\u001B[31m";
        String FG_GREEN = "\u001B[32m";
        String FG_YELLOW = "\u001B[33m";
        String FG_DEFAULT = "\u001B[0m";

        // сумму < 20 выдать никак не получится
        if (amount < 20) {
            System.out.println(FG_RED + MSG_WRONG_REQUEST + FG_DEFAULT);
            return false;
        }

        int given_notes_20 = 0, given_notes_50 = 0, given_notes_100 = 0;

        // по возможности, половину суммы выдаём "сотками"
        if ((amount / 2) / 100 <= this.notes_100 && (amount / 2) / 100 > 0) {
            given_notes_100 = (amount / 2) / 100;
            amount -= given_notes_100 * 100;
        }
        // по возможности, остальное выдаём "пятидесятками"
        // но только так чтобы было без остатка = 10 либо 30, и/или остаток можно было полностью выдать "двадцатками"
        if ((amount - amount % 100) / 50 <= this.notes_50 && (amount - amount % 100) / 50 > 0) {
            given_notes_50 = ((amount - amount % 100) / 50);
            amount -= given_notes_50 * 50;

            // 10 или 30 не получится выдать. Поэтому забираем 50 обратно, а 10+50=60 или 30+50=80 выдаём "двадцатками"
            if (amount == 10 || amount == 30) {
                amount += 50;
                given_notes_50--;
            }
        }
        // Выдаём остаток "двадцатками"
        if (amount % 20 == 0)
            if (this.notes_20 >= amount / 20) {
                given_notes_20 += amount / 20;
                amount -= (amount / 20) * 20;
            }
            else {
                System.out.println(FG_RED + MSG_LACK_OF_NOTES + FG_DEFAULT);
                return false;
            }
        // Если одними "двадцатками" не получается, то выдаём "пятидесятками" и "двадцатками"
        if (amount % 20 == 10) {
            if (this.notes_50 >= amount / 50) {
                given_notes_50 += amount / 50;
                amount -= (amount / 50) * 50;
            }
            else {
                System.out.println(FG_RED + MSG_LACK_OF_NOTES + FG_DEFAULT);
                return false;
            }
            if (this.notes_20 >= amount / 20) {
                given_notes_20 += amount / 20;
                amount -= (amount / 20) * 20;
            }
            else {
                System.out.println(FG_RED + MSG_LACK_OF_NOTES + FG_DEFAULT);
                return false;
            }
        }
        // Если сумма была введена не кратной 10, например, 165, то остаток (5) никак вывести не получится
        if (amount != 0) {
            System.out.println(FG_RED + MSG_WRONG_REQUEST + FG_DEFAULT);
            return false;
        }

        // Уменьшаем количество оставшихся купюр в банкомате только после того, как операция одобрена
        this.notes_100 -= given_notes_100;
        this.notes_50 -= given_notes_50;
        this.notes_20 -= given_notes_20;

        // Цветной вывод информации о количестве выданных купюр
        System.out.print("\t. Выдано: ");
        if (given_notes_100 > 0)
            System.out.print(FG_BLUE + " [100]" + FG_DEFAULT + "*" + given_notes_100);
        if (given_notes_50 > 0)
            System.out.print(FG_GREEN + " [50]" + FG_DEFAULT + "*" + given_notes_50);
        if (given_notes_20 > 0)
            System.out.print(FG_YELLOW + " [20]" + FG_DEFAULT + "*" + given_notes_20);

        System.out.println();

        return true;
    }
}
