package com.example.unitconverterandroid.Area;

public class MSquareToCMSquareConverter implements AreaConverter {
    @Override
    public double convert(double value) {
        return value * 10000; // 1 m^2 = 10000 cm^2
    }
}



