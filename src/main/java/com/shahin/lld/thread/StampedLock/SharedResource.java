package com.shahin.lld.thread.StampedLock;


import java.util.concurrent.locks.StampedLock;

/*A StampedLock is like a faster, more flexible ReadWriteLock
that adds a special optimistic read mode for performance.*/
public class SharedResource {

    StampedLock lock = new StampedLock();

    int a = 10;

    public void producer() {
        long stamp = lock.tryOptimisticRead();

        try {

            System.out.println("Take Optimistic read ");
            Thread.sleep(6000);

            if (lock.validate(stamp)) {
                System.out.println("Updated a value successfully");
            } else {
                a = 10;
                System.out.println("Rollback the value");
            }

        } catch (Exception ignored) {
        }
    }

    public void consumer() {
        long stamp = lock.writeLock();
        System.out.println("Write Lock acquire by : " + Thread.currentThread().getName());
        try {
            System.out.println("Performing work");
            a = 9;
        } catch (Exception ignored) {
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock release by : " + Thread.currentThread().getName());
        }
    }
}
