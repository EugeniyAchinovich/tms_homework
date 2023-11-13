package lesson_19.homework.task_3;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++)
                    shop.produceProduct("Производитель");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread buyerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++)
                    shop.buyProduct("Покупатель");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        buyerThread.start();
    }
}
