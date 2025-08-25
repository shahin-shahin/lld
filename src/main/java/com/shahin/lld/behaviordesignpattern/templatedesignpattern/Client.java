package com.shahin.lld.behaviordesignpattern.templatedesignpattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Processing Digital Order:");
        OrderProcessTemplate digitalOrder = new DigitalOrder();
        digitalOrder.processOrder();

        System.out.println("\nProcessing Physical Order:");
        OrderProcessTemplate physicalOrder = new PhysicalOrder();
        physicalOrder.processOrder();
    }
}
