package com.shahin.lld.behaviordesignpattern.nullobjectdesignpattern;

public class NullCustomer implements Customer {
    @Override
    public String getName() {
        return "Not Available";
    }
}