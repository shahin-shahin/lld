package com.shahin.lld.thread.StampedLock;

public class Client {

    public static void main(String[] args){
        SharedResource resource = new SharedResource();

        Thread th1 = new Thread(()->{
            resource.producer();
        });

        Thread th2 = new Thread(()->{
            resource.consumer();
        });

        th1.start();
       // th2.start();
    }


}
