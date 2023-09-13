package lesson_6.homework;

public class CreditCard {
    public String number;
    public double balance;

    public CreditCard(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void replenish(int amount) {
        this.balance += amount;
    }

    public void chargeOff(int amount) {
        this.balance -= amount;
    }

    public void printInfo() {
        System.out.println("\n=== Данные карты ===");
        System.out.println("Номер карты: " + this.number);
        System.out.println("Баланс: " + this.balance);
    }
}
