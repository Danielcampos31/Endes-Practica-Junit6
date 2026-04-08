package edu.camposPenaDaniel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    private final ConversorTemperatura conv = new ConversorTemperatura();

    @Test
    void testConversiones() {
        assertEquals(32.0, conv.celsiusAFahrenheit(0));
        assertEquals(0.0, conv.fahrenheitACelsius(32));
    }
}