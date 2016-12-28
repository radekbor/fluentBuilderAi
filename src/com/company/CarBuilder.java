package com.company;

import java.util.List;

public class CarBuilder {

    private Engine engine;
    private List<Wheel> wheels;

    public static CarBuilder newBuilder() {
        return new CarBuilder();
    }

    public CarBuilder withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder withWheelList(List<Wheel> wheels) {
        this.wheels = wheels;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setEngine(this.engine);
        car.setWheels(this.wheels);
        return car;
    }
}
