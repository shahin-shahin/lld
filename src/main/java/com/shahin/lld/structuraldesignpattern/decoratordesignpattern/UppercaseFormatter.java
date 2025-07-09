package com.shahin.lld.structuraldesignpattern.decoratordesignpattern;

public class UppercaseFormatter extends TextFormatterDecorator {

    public UppercaseFormatter(TextFormatter wrapped) {
        super(wrapped);
    }

    @Override
    public String format(String text) {
        return super.format(text).toUpperCase();
    }
}
