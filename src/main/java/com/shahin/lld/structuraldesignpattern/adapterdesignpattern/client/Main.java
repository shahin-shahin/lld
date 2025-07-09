package com.shahin.lld.structuraldesignpattern.adapterdesignpattern.client;

import com.shahin.lld.structuraldesignpattern.adapterdesignpattern.adaptee.WeightMachineForBabies;
import com.shahin.lld.structuraldesignpattern.adapterdesignpattern.adapter.WeightMachineAdapter;
import com.shahin.lld.structuraldesignpattern.adapterdesignpattern.adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
