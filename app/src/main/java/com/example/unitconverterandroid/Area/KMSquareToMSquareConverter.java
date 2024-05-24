package com.example.unitconverterandroid.Area;

public class KMSquareToMSquareConverter implements AreaConverter {
    @Override
    public double convert(double value) {
        return value * 1000000; // 1 km^2 = 1000000 m^2
    }
}