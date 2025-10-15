package com.shahin.lld.behaviordesignpattern.observerdesignpattern.another;

// Client code


public class ObserverPatternDemo {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        TemperatureDisplay display = new TemperatureDisplay();

        station.registerObserver(display);

        station.setTemperature(25);

        station.setTemperature(30);

    }

}
