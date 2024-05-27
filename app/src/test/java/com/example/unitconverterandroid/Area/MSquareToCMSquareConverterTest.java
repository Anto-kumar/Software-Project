package com.example.unitconverterandroid.Area;

import org.junit.Test;
import static org.junit.Assert.*;

public class MSquareToCMSquareConverterTest {
    @Test
    public void testConvert() {
        MSquareToCMSquareConverter converter = new MSquareToCMSquareConverter();
        double input = 1; // 1 m^2
        double expectedOutput = 10000; // 10000 cm^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertZero() {
        MSquareToCMSquareConverter converter = new MSquareToCMSquareConverter();
        double input = 0; // 0 m^2
        double expectedOutput = 0; // 0 cm^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertNegative() {
        MSquareToCMSquareConverter converter = new MSquareToCMSquareConverter();
        double input = -1; // -1 m^2
        double expectedOutput = -10000; // -10000 cm^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertLargeNumber() {
        MSquareToCMSquareConverter converter = new MSquareToCMSquareConverter();
        double input = 1e3; // 1000 m^2
        double expectedOutput = 1e7; // 10,000,000 cm^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertSmallNumber() {
        MSquareToCMSquareConverter converter = new MSquareToCMSquareConverter();
        double input = 0.0001; // 0.0001 m^2
        double expectedOutput = 1; // 1 cm^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertInvalidInput() {
        MSquareToCMSquareConverter converter = new MSquareToCMSquareConverter();
        converter.convert(Double.parseDouble("invalid"));
    }
}
