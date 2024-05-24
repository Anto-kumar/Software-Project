package com.example.unitconverterandroid.Currency;

public class CurrencyConverterFactory {

    public static CurrencyConverter getConverter(String type, double value) {
        if (type.equalsIgnoreCase("takatodollar")) {
            return takatodollar.getInstance(value);
        } else if (type.equalsIgnoreCase("takatorupee")) {
            return takatorupee.getInstance(value);
        }
         else if (type.equalsIgnoreCase("dollartotaka")) {
            return dollartotaka.getInstance(value);
        }
         else if (type.equalsIgnoreCase("rupitotaka")) {
                return rupeetotaka.getInstance(value);
            }

        throw new IllegalArgumentException("Unknown currency conversion type: " + type);
    }
}
