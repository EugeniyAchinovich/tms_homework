package lesson_19.homework.task_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Shop {
    private int productCount;

    public final int MAX_PRODUCT_COUNT = 5;

    private final Lock lock = new ReentrantLock();
    private final Condition productProduced = lock.newCondition();
    private final Condition productSold = lock.newCondition();

    public void produceProduct(String producer) throws InterruptedException {
        lock.lock();

        try {
            while (productCount >= MAX_PRODUCT_COUNT)
                productProduced.await();

            System.out.println(producer + " произвел продукт");
            productCount++;
            productSold.signal();
        }
        finally {
            lock.unlock();
        }
    }

    public void buyProduct(String buyer) throws InterruptedException {
        lock.lock();
        try {
            while (productCount <= 0)
                productSold.await();

            System.out.println(buyer + " купил продукт");
            productCount--;
            productProduced.signal();
        }
        finally {
            lock.unlock();
        }
    }
}
