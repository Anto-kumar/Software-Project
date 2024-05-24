package com.example.unitconverterandroid.Length;
public class LengthConverterFactory {
    public static LengthConverter getConverter(String type, double value)
    {
        if (type.equalsIgnoreCase("feettometer")) {
            return FeetToMeter.getInstance(value);
        } else if (type.equalsIgnoreCase("metertocm")) {
            return MeterToCm.getInstance(value);
        } else if (type.equalsIgnoreCase("metertofeet")) {
            return MeterToFeet.getInstance(value);
        }else if (type.equalsIgnoreCase("cmtometer")) {
            return CmToInch.getInstance(value);
        }
        throw new IllegalArgumentException("Unknown length conversion type: " + type);
    }

}
