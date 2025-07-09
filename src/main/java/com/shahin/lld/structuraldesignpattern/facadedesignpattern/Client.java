package com.shahin.lld.structuraldesignpattern.facadedesignpattern;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();  // Facade hides all the subsystem complexity
    }
}
