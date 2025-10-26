package com.shahin.lld.thread.ReadWritelock;

import java.util.concurrent.locks.ReadWriteLock;

/*       A ReadWriteLock lets many threads read a resource at the same time,
        but only one thread write, and writing blocks everyone else.
        */

public class SharedResource {

    public void producer(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("Read Lock acquire by : "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (Exception ignored) {
        } finally {
            lock.readLock().unlock();
            System.out.println(" Read lock release by : "+ Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock){
        try {
            lock.writeLock().lock();
            System.out.println("Write Lock acquire by : "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (Exception ignored) {
        } finally {
            lock.writeLock().unlock();
            System.out.println("Write lock release by : "+ Thread.currentThread().getName());
        }
    }
}
