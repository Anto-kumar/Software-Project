package com.example.unitconverterandroid.Area;

public class AreaConverterFactory {
    public static AreaConverter getConverter(String conversionType) {
        switch (conversionType) {
            case "MSquareToCMSquare":
                return new MSquareToCMSquareConverter();
            case "KMSquareToMSquare":
                return new KMSquareToMSquareConverter();
            case "CMSquareToMSquare":
                return new CMSquareToMSquareConverter();
            default:
                throw new IllegalArgumentException("Unknown conversion type");
        }
    }
}
