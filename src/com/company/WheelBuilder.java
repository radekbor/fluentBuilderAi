package com.company;

public class WheelBuilder {

    private int size;

    private int type;

    private int colour;

    private WheelBuilder() {}

    public WheelBuilder withSize(int size) {

        this.size = size;

        return this;

    }

    public WheelBuilder withType(int type) {

        this.type = type;

        return this;

    }

    public WheelBuilder withColour(int colour) {

        this.colour = colour;

        return this;

    }

    public Wheel build() {
        Wheel wheel = new Wheel();
        wheel.setColour(this.colour);
        wheel.setType(this.type);
        wheel.setSize(this.size);
        return wheel;
    }

    public static WheelBuilder newBuilder() {
        return new WheelBuilder();
    }

    private WheelListBuilder wheelListBuilder;

    public WheelListBuilder addWheelToList(){
        this.wheelListBuilder.addWheel(this.build());
        return wheelListBuilder;
    }

    public void withWheelListBuilder(WheelListBuilder wheelListBuilder) {
        this.wheelListBuilder = wheelListBuilder;
    }
}
