package com.design.lld.creationaldesionpattern.singletondesignpattern;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello from logger1!");
        logger2.log("Hello from logger2!");

        System.out.println(logger1 == logger2); // true
    }
}
