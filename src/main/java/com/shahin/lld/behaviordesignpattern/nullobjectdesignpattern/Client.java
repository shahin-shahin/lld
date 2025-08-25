package com.shahin.lld.behaviordesignpattern.nullobjectdesignpattern;

public class Client {

    public static void main(String[] args){
        Customer customer = CustomerFactory.getCustomerById(123);
        System.out.println(customer.getName());
    }
}
