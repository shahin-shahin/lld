package com.shahin.lld.structuraldesignpattern.decoratordesignpattern;

public class PlainTextFormatter implements TextFormatter {
    public String format(String text) {
        return text;
    }
}

