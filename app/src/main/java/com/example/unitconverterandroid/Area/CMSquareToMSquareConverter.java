package com.example.unitconverterandroid.Area;

public class CMSquareToMSquareConverter implements AreaConverter {
    @Override
    public double convert(double value) {
        return value / 10000; // 1 cm^2 = 0.0001 m^2
    }
}
