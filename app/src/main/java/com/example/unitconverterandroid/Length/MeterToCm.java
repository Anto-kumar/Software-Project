package com.example.unitconverterandroid.Length;

public class MeterToCm extends LengthMain implements LengthConverter{
    private static MeterToCm instance;

    private MeterToCm(double value) {
        super(value);
    }

    public static synchronized MeterToCm getInstance(double value) {
        if (instance == null) {
            instance = new MeterToCm(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 100;
    }
}
