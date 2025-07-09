package com.shahin.lld.structuraldesignpattern.decoratordesignpattern;

public class EncryptFormatter extends TextFormatterDecorator {

    public EncryptFormatter(TextFormatter wrapped) {
        super(wrapped);
    }

    @Override
    public String format(String text) {
        // Mock "encryption" just for demo
        return new StringBuilder(super.format(text)).reverse().toString();
    }
}
