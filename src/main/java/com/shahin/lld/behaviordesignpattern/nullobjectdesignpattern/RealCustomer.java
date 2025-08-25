package com.shahin.lld.behaviordesignpattern.nullobjectdesignpattern;

public class RealCustomer implements Customer {
    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}