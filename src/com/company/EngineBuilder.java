package com.company;

public class EngineBuilder {
    private int power;
    private int type;

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
}
