package com.gla.Interface.q1;

public class AC implements SmartDevice{
    @Override
    public void TurnOn() {
        System.out.println("Ac turned On");
    }

    @Override
    public void TurnOff() {
        System.out.println("Ac turned off");
    }
}
