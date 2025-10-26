package com.shahin.lld.thread;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                    // corePoolSize: keep at least 2 threads
                4,                    // maximumPoolSize: allow up to 4 threads
                10, TimeUnit.SECONDS, // keepAliveTime: idle threads die after 10s
                new ArrayBlockingQueue<>(10) // workQueue: tasks waiting in queue
        );


      try{
          CompletableFuture<String> result = CompletableFuture.supplyAsync(()->{

              System.out.println("Current Thread"+ Thread.currentThread().getName());

              return "Concept and";
          },executor).thenApplyAsync((String val)->{
              System.out.println("thenApply thread :"+ Thread.currentThread().getName());

              return val +"coding";
          },executor);


          System.out.println(" status :"+ result.get());
      }catch (Exception e){

      }

    }

}
