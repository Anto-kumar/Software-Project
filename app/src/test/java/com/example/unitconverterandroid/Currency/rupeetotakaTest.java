package com.example.unitconverterandroid.Currency;

import static org.junit.Assert.*;

public class rupeetotakaTest {

    @org.junit.Test
    public void convert() {
        CurrencyConverter rupeetotaka = CurrencyConverterFactory.getConverter("rupitotaka", 1);
        assertEquals(1.2, rupeetotaka.convert(), 0.0);

        CurrencyConverter rupeetotaka2 = CurrencyConverterFactory.getConverter("rupitotaka", 2);
        assertEquals(2.4, rupeetotaka2.convert(), 0.0);
    }

}