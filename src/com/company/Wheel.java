package com.company;

public class Wheel {

    private int size;

    private int type;

    private int colour;

    public Wheel() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Wheel with Colour = %d and Type = %d and Size %d", colour, type, size);
    }
}
