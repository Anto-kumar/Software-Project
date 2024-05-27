package com.example.unitconverterandroid.Area;

import org.junit.Test;
import static org.junit.Assert.*;

public class KMSquareToMSquareConverterTest {
    @Test
    public void testConvert() {
        KMSquareToMSquareConverter converter = new KMSquareToMSquareConverter();
        double input = 1; // 1 km^2
        double expectedOutput = 1000000; // 1000000 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertZero() {
        KMSquareToMSquareConverter converter = new KMSquareToMSquareConverter();
        double input = 0; // 0 km^2
        double expectedOutput = 0; // 0 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertNegative() {
        KMSquareToMSquareConverter converter = new KMSquareToMSquareConverter();
        double input = -1; // -1 km^2
        double expectedOutput = -1000000; // -1000000 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertSmallNumber() {
        KMSquareToMSquareConverter converter = new KMSquareToMSquareConverter();
        double input = 0.000001; // 0.000001 km^2
        double expectedOutput = 1; // 1 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertInvalidInput() {
        KMSquareToMSquareConverter converter = new KMSquareToMSquareConverter();
        converter.convert(Double.parseDouble("invalid"));
    }
}
