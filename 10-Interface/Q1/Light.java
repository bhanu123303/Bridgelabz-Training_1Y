package com.gla.Interface.q1;

public class Light implements SmartDevice {
    @Override
    public void TurnOn() {
        System.out.println("Light Turned on");
    }

    @Override
    public void TurnOff() {
        System.out.println("Light turned off");
    }
}
