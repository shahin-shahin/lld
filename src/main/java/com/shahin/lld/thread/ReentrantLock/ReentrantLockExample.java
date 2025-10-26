package com.shahin.lld.thread.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;


/*
A ReentrantLock allows only one thread to access the locked code (critical section) at a time —
no matter whether it’s reading or writing.
*/

public class ReentrantLockExample {

    public void outer(ReentrantLock lock) {
        lock.lock();
        try {
            System.out.println("Lock acquire by : " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (Exception ignored) {
        } finally {
            lock.unlock();
            System.out.println("lock release by : " + Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        ReentrantLockExample example1 = new ReentrantLockExample();
        ReentrantLockExample example2 = new ReentrantLockExample();

        Thread th1 = new Thread(() -> {
            example1.outer(lock);
        });

        Thread th2 = new Thread(() -> {
            example1.outer(lock);
        });

        th1.start();
        th2.start();
    }
}
