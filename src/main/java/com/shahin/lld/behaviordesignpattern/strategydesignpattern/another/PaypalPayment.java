package com.shahin.lld.behaviordesignpattern.strategydesignpattern.another;

import org.springframework.stereotype.Component;

@Component("paypalPayment")
public class PaypalPayment implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using PayPal.";
    }
}
