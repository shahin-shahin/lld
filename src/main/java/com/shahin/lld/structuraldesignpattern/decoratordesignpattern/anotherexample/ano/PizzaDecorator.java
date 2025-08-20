package com.shahin.lld.structuraldesignpattern.decoratordesignpattern.anotherexample.ano;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }
}