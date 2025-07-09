package com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.abstraction;

import com.shahin.lld.structuraldesignpattern.bridgedesignpattern.anotherexample.implementor.MessageSender;

public abstract class Notification {
    protected MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String subject, String message);
}
