package com.example.unitconverterandroid.Length;

public class FeetToMeter extends LengthMain implements LengthConverter{
    private static FeetToMeter instance;

    private FeetToMeter(double value) {
        super(value);
    }

    public static synchronized FeetToMeter getInstance(double value) {
        if (instance == null) {
            instance = new FeetToMeter(value);
        } else {
            // Optionally update the value if a new value is provided
            instance.value = value;
        }
        return instance;
    }

    @Override
    public double convert() {
        return value * 0.3048;
    }
}
