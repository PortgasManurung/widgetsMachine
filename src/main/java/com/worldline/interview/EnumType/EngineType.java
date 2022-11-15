package com.worldline.interview.EnumType;

public enum EngineType {
    InternalCombustion(8),
    Steam(2);

    private int value;

    EngineType(int value){
        this.value = value;
    }
    public int getResponse() {
        return value;
    }
}

