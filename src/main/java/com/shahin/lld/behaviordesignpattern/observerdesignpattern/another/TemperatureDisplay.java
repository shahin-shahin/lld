package com.shahin.lld.behaviordesignpattern.observerdesignpattern.another;

// Concrete Observer

class TemperatureDisplay implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Current Temperature: " + temperature + "°C");
    }

}
