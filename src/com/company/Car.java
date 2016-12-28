package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Car {

    private Engine engine;

    private List<Wheel> wheelList;


    public void setWheels(List<Wheel> wheels) {
        this.wheelList = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(engine.toString());
        stringBuilder.append("\nWith wheels:\n{\n");
        stringBuilder.append(wheelList.stream().map(Wheel::toString).collect(Collectors.joining("\n")));
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
