package com.company;

public class Engine {

    private int power;

    private int type;

    public void setPower(int power) {
        this.power = power;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Engine with Poweer = %d and Type = %d", power, type);
    }
}
