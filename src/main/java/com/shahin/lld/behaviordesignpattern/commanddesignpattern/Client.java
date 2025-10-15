package com.shahin.lld.behaviordesignpattern.commanddesignpattern;


// 1. Command Interface
public class Client {
    public static void main(String[] args) {


        Light livingRoomLight = new Light(); //executor or receiver

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl(); //controller or Invoker

        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON
        remote.pressUndo();    // Output: Light is OFF

        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF
        remote.pressUndo();    // Output: Light is ON
    }
}
