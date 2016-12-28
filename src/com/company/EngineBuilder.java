package com.company;

public class EngineBuilder {
    private int power;
    private int type;
    private CarBuilder carBuilder;

    public static EngineBuilder newBuilder() {
        return new EngineBuilder();
    }

    public EngineBuilder withPower(int i) {
        this.power = i;
        return this;
    }

    public EngineBuilder withType(int i) {
        this.type = i;
        return this;
    }

    public Engine build() {
        Engine engine = new Engine();
        engine.setPower(this.power);
        engine.setType(this.type);
        return engine;
    }

    public void withCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarBuilder done() {
        carBuilder.withEngine(this.build());
        return this.carBuilder;
    }
}
