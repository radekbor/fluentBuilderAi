package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Engine engine = EngineBuilder.newBuilder().withPower(100).withType(5).build();

        Wheel wheel1 = WheelBuilder.newBuilder().withType(2).withColour(3).withSize(4).build();

        Wheel wheel2 = WheelBuilder.newBuilder().withType(2).withColour(3).withSize(4).build();

        Wheel wheel3 = WheelBuilder.newBuilder().withType(2).withColour(3).withSize(4).build();

        List<Wheel> wheels = new ArrayList<>();

        wheels.add(wheel1);

        wheels.add(wheel2);

        wheels.add(wheel3);

        Car car = CarBuilder.newBuilder()

                .withEngine(engine)

                .withWheelList(wheels)

                .build();

        System.out.println("car = " + car);
    }
}

