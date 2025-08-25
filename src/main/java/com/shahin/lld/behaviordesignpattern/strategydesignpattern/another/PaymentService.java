package com.shahin.lld.behaviordesignpattern.strategydesignpattern.another;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class PaymentService {

    private final Map<String, PaymentStrategy> strategies;

    // Spring will inject all PaymentStrategy beans into a Map
    public PaymentService(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public String processPayment(String method, double amount) {
        PaymentStrategy strategy = strategies.get(method);
        if (strategy == null) {
            throw new IllegalArgumentException("No payment method found: " + method);
        }
        return strategy.pay(amount);
    }
}

