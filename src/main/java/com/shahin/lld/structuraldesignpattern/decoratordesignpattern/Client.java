package com.shahin.lld.structuraldesignpattern.decoratordesignpattern;

public class Client {
    public static void main(String[] args) {
        String rawText = "Hello Decorator Pattern";

        // Apply multiple decorators dynamically
        TextFormatter formatter = new EncryptFormatter(
                new HtmlFormatter(
                        new UppercaseFormatter(
                                new PlainTextFormatter())));

        String formatted = formatter.format(rawText);
        System.out.println("Final Output: " + formatted);
    }
}

