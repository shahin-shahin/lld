package com.shahin.lld.structuraldesignpattern.decoratordesignpattern;

public abstract class TextFormatterDecorator implements TextFormatter {
    protected TextFormatter wrapped;

    public TextFormatterDecorator(TextFormatter wrapped) {
        this.wrapped = wrapped;
    }

    public String format(String text) {
        return wrapped.format(text);
    }
}
