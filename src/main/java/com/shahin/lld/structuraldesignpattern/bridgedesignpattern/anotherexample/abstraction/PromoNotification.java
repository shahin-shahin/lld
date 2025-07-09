package com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.abstraction;

import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor.MessageSender;

public class PromoNotification extends Notification {
    public PromoNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String subject, String message) {
        sender.sendMessage("[PROMO] " + subject, message);
    }
}