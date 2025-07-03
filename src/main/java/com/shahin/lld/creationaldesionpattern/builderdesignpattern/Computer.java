package com.shahin.lld.creationaldesionpattern.builderdesignpattern;

public class Computer {
    // Required parameters
    private String cpu;
    private int ram;

    // Optional parameters
    private boolean graphicsCard;
    private boolean wifi;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private int ram;

        private boolean graphicsCard;
        private boolean wifi;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder withGraphicsCard(boolean value) {
            this.graphicsCard = value;
            return this;
        }

        public Builder withWifi(boolean value) {
            this.wifi = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", graphicsCard=" + graphicsCard +
                ", wifi=" + wifi +
                '}';
    }
}
