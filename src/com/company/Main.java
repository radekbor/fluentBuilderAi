package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Engine engine = EngineBuilder.newBuilder().withPower(100).withType(5).build();

        Wheel wheel1 = WheelBuilder.newBuilder().withType(2).withColour(3).withSize(4).build();
        Wheel wheel2 = WheelBuilder.newBuilder().withType(2).withColour(3).withSize(4).build();
        Wheel wheel3 = WheelBuilder.newBuilder().withType(2).withColour(3).withSize(4).build();

        List<Wheel> wheelList = WheelListBuilder.newBuilder()
                .withNewList()
                .addWheel(wheel1)
                .addWheel(wheel2)
                .addWheel(wheel3)
                .build();

        Car car = CarBuilder.newBuilder()
                .withEngine(engine)
                .withWheelList(wheelList)
                .build();

        System.out.println("car = " + car);
    }
}

