package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Engine engine = EngineBuilder.newBuilder().withPower(100).withType(5).build();

        List<Wheel> wheelList = WheelListBuilder.newBuilder()
                .addWheel().withType(1).withSize(2).withColour(2).addWheelToList()
                .addWheel().withType(1).withSize(2).withColour(2).addWheelToList()
                .addWheel().withType(1).withSize(2).withColour(2).addWheelToList()
                .addWheel().withType(1).withSize(2).withColour(2).addWheelToList()
                .build();

        Car car = CarBuilder.newBuilder()
                .withEngine(engine)
                .withWheelList(wheelList)
                .build();

        System.out.println("car = " + car);
    }
}

