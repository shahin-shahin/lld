package com.shahin.lld.behaviordesignpattern.templatedesignpattern;

class PhysicalOrder extends OrderProcessTemplate {
    @Override
    protected void selectItems() {
        System.out.println("Selecting physical products...");
    }

    @Override
    protected void makePayment() {
        System.out.println("Processing payment for physical products...");
    }
    @Override
    protected void deliver() {
        System.out.println("Shipping physical products to the customer.");
    }
}