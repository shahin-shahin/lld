package com.shahin.lld.structuraldesignpattern.facadedesignpattern;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from hard drive...");
        return new byte[]{1, 2, 3}; // dummy data
    }
}

