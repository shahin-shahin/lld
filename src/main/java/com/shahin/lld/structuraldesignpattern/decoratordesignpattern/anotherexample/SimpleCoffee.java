package com.shahin.lld.structuraldesignpattern.decoratordesignpattern.anotherexample;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0; // Base price of coffee
    }
}
