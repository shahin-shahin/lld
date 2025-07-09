package com.shahin.lld.structuraldesignpattern.adapterdesignpattern.adapter;

import com.shahin.lld.structuraldesignpattern.adapterdesignpattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {

        double weightInPound = weightMachine.getWeightInPound();

        //Convert it to KGs
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}
