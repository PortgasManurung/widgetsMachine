package com.worldline.interview.Services;
import com.worldline.interview.EnumType.EngineType;
import com.worldline.interview.EnumType.FuelType;

import static java.lang.String.format;


public class WidgetMachine {
    private Engine engine = new Engine(FuelType.COAL);

    public WidgetMachine(FuelType fuelType)
    {
        engine = new Engine((fuelType));
    }
    public WidgetMachine() {}


    public double produceWidgets(int quantity) {
        engine.start();
        double cost = 0;

        if (engine.isRunning()) {
            cost = produce(quantity);
        }

        engine.stop();
        return cost;
    }

    private double produce(int quantity) {
        int batch = 0;
        int batchCount = 0;
        double costPerBatch = 0;

        if (engine.getFuelType() == FuelType.WOOD) {
            costPerBatch = 4.35;
        } else if (engine.getFuelType() == FuelType.COAL) {
            costPerBatch = 5.65;
        }

        while (batch < quantity) {
            batch = batch + EngineType.InternalCombustion.getResponse();
            batchCount++;
        }
        return batchCount * costPerBatch;
    }
}
