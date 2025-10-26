package com.shahin.lld.thread.semaphorelock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    Semaphore lock = new Semaphore(2);

    public void producer(){
        try {
            lock.acquire();
            System.out.println(" Lock acquire by : "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (Exception ignored) {
        } finally {
            lock.release();
            System.out.println(" lock release by : "+ Thread.currentThread().getName());
        }
    }
}
