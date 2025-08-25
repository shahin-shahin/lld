package com.shahin.lld.behaviordesignpattern.templatedesignpattern;

class DigitalOrder extends OrderProcessTemplate {
    @Override
    protected void selectItems() {
        System.out.println("Selecting digital products...");
    }

    @Override
    protected void makePayment() {
        System.out.println("Processing online payment for digital products...");
    }
    @Override
    protected void deliver() {
        System.out.println("Delivering digital products via email.");
    }
}
