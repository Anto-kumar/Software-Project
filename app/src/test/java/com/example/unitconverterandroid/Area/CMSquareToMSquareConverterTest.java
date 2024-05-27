package com.example.unitconverterandroid.Area;
import org.junit.Test;
import static org.junit.Assert.*;

public class CMSquareToMSquareConverterTest {
    @Test
    public void testConvert() {
        CMSquareToMSquareConverter converter = new CMSquareToMSquareConverter();
        double input = 10000; // 10000 cm^2
        double expectedOutput = 1; // 1 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertZero() {
        CMSquareToMSquareConverter converter = new CMSquareToMSquareConverter();
        double input = 0; // 0 cm^2
        double expectedOutput = 0; // 0 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertNegative() {
        CMSquareToMSquareConverter converter = new CMSquareToMSquareConverter();
        double input = -10000; // -10000 cm^2
        double expectedOutput = -1; // -1 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0001);
    }

    @Test
    public void testConvertSmallNumber() {
        CMSquareToMSquareConverter converter = new CMSquareToMSquareConverter();
        double input = 1; // 1 cm^2
        double expectedOutput = 0.0001; // 0.0001 m^2
        assertEquals(expectedOutput, converter.convert(input), 0.0000001);
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertInvalidInput() {
        CMSquareToMSquareConverter converter = new CMSquareToMSquareConverter();
        converter.convert(Double.parseDouble("invalid"));
    }
}
