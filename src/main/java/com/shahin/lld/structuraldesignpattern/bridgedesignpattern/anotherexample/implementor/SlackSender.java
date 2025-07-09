package com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor;

import org.springframework.stereotype.Component;

@Component
public class SlackSender implements MessageSender {
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Sending SLACK Message: " + subject + " - " + body);
    }
}
