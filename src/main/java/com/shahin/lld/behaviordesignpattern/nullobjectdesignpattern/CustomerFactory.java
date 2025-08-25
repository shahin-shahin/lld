package com.shahin.lld.behaviordesignpattern.nullobjectdesignpattern;

public class CustomerFactory {
    public static Customer getCustomerById(int id) {
        if (id == 123) {
            return new RealCustomer("John Doe");
        } else {
            return new NullCustomer();
        }
    }
}
