package com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor;

import org.springframework.stereotype.Component;

@Component
public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Sending SMS: " + subject + " - " + body);
    }
}
