package com.shahin.lld.behaviordesignpattern.strategydesignpattern.another;

import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Credit Card.";
    }
}