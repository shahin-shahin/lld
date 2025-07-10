package com.shahin.lld.structuraldesignpattern.decoratordesignpattern.anotherexample;

public class Client {
    public static void main(String[] args) {
        // Order a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add sugar to the coffee with milk
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
