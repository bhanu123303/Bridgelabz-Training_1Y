package com.gla.inheritance;

public class TransportDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);

        for (Vehicle v : vehicles) {
            v.displayInfo();            }
    }
}
