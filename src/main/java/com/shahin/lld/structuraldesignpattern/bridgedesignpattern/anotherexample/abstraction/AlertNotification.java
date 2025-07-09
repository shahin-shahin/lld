package com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.abstraction;

import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor.MessageSender;

public class AlertNotification extends Notification {
    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String subject, String message) {
        sender.sendMessage("[ALERT] " + subject, message);
    }
}