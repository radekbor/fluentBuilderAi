package com.company;

import java.util.ArrayList;
import java.util.List;

public class WheelListBuilder {

    public static WheelListBuilder newBuilder(){
        WheelListBuilder builder = new WheelListBuilder();
        builder.withNewList();
        return builder;
    }

    private WheelListBuilder() {}

    private List<Wheel> wheelList;

    public WheelListBuilder withNewList(){
        this.wheelList = new ArrayList<>();
        return this;
    }

    public WheelListBuilder withList(List wheelList){
        this.wheelList = wheelList;
        return this;
    }

    public WheelListBuilder addWheel(Wheel wheel){
        this.wheelList.add(wheel);
        return this;
    }

    public List<Wheel> build(){
        return this.wheelList;
    }


    public WheelBuilder addWheel() {
        WheelBuilder builder = WheelBuilder.newBuilder();
        builder.withWheelListBuilder(this);
        return builder;
    }
}