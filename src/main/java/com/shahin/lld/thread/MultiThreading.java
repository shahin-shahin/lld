package com.shahin.lld.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreading {

    boolean isAvailable = false;

    ReentrantLock reentrantLock = new ReentrantLock();

    public void producer(){
      try {
          reentrantLock.lock();

          System.out.println("Lock acquire by "+ Thread.currentThread().getName());
          Thread.sleep(4000);
      }catch (Exception e){

      }finally {
          reentrantLock.unlock();
          System.out.println("lock release "+Thread.currentThread().getName());
      }
    }

}
