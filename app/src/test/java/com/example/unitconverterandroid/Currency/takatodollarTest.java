package com.example.unitconverterandroid.Currency;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class takatodollarTest {

    @Before
    public void setUp() {

        TakaToDollarTestHelper.resetInstance();
    }

    @Test
    public void testSingletonInstance() {
        takatodollar instance1 = takatodollar.getInstance(100.0);
        takatodollar instance2 = takatodollar.getInstance(200.0);

        // Check that both instances are the same
        assertEquals(instance1, instance2);

        // Check that the value has been updated in the singleton instance
        assertEquals(200.0 * 0.012, instance1.convert(), 0.0001);
    }

    @Test
    public void testConversion() {
        takatodollar converter = takatodollar.getInstance(100.0);
        double result = converter.convert();

        // Check the conversion result
        assertEquals(100.0 * 0.012, result, 0.0001);
    }
}

// Helper class to reset the singleton instance for testing purposes
class TakaToDollarTestHelper {
    public static void resetInstance() {
        try {
            java.lang.reflect.Field instance = takatodollar.class.getDeclaredField("instance");
            instance.setAccessible(true);
            instance.set(null, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
