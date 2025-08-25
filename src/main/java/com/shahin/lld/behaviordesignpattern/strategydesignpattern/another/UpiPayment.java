package com.shahin.lld.behaviordesignpattern.strategydesignpattern.another;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UpiPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using UPI.";
    }
}