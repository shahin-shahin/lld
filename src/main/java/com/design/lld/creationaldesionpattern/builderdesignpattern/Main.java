package com.design.lld.creationaldesionpattern.builderdesignpattern;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder("Intel i7", 16)
                .withGraphicsCard(true)
                .withWifi(true)
                .build();

        System.out.println(myComputer);
    }
}
