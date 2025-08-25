package com.shahin.lld.behaviordesignpattern.strategydesignpattern.another;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String pay(@RequestParam String method, @RequestParam double amount) {
        return paymentService.processPayment(method, amount);
    }
}
