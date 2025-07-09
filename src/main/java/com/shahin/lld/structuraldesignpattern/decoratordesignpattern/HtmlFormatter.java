package com.shahin.lld.structuraldesignpattern.decoratordesignpattern;

public class HtmlFormatter extends TextFormatterDecorator {

    public HtmlFormatter(TextFormatter wrapped) {
        super(wrapped);
    }

    @Override
    public String format(String text) {
        return "<p>" + super.format(text) + "</p>";
    }
}

