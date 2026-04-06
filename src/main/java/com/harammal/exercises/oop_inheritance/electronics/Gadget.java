package com.harammal.exercises.oop_inheritance.electronics;

public class Gadget {
    protected String brand;
    protected double batteryLife;

    public Gadget(String brand, double batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public String getStatus() {
        return "Gadget{" + "brand='" + brand + "', batteryLife=" + batteryLife + "}";
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
