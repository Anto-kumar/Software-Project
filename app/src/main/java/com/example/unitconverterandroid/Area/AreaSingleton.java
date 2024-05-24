package com.example.unitconverterandroid.Area;

public class AreaSingleton {
    private static AreaSingleton instance;

    private AreaSingleton() {
        // Private constructor to prevent instantiation
    }

    public static synchronized AreaSingleton getInstance() {
        if (instance == null) {
            instance = new AreaSingleton();
        }
        return instance;
    }

    public double convert(String conversionType, double value) {
        AreaConverter converter = AreaConverterFactory.getConverter(conversionType);
        return converter.convert(value);
    }
}

