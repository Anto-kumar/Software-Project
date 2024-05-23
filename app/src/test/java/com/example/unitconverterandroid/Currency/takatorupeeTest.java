package com.example.unitconverterandroid.Currency;

import org.junit.Test;
import static org.junit.Assert.*;

import com.example.unitconverterandroid.Currency.takatorupee;

public class takatorupeeTest {

    @Test
    public void testSingletonInstance() {
        takatorupee instance1 = takatorupee.getInstance(10.0);
        takatorupee instance2 = takatorupee.getInstance(20.0);

        // Check if both instances are the same
        assertSame(instance1, instance2);
    }

    @Test
    public void testConversion() {
        takatorupee instance = takatorupee.getInstance(10.0);
        double expected = 8.0; // 10.0 * 0.8
        assertEquals(expected, instance.convert(), 0.001);
    }

    @Test
    public void testValueUpdate() {
        takatorupee instance = takatorupee.getInstance(10.0);
        double expectedFirstConversion = 8.0; // 10.0 * 0.8
        assertEquals(expectedFirstConversion, instance.convert(), 0.001);

        // Update value
        instance = takatorupee.getInstance(20.0);
        double expectedSecondConversion = 16.0; // 20.0 * 0.8
        assertEquals(expectedSecondConversion, instance.convert(), 0.001);
    }
}
