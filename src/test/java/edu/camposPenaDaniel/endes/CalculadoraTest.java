package edu.camposPenaDaniel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testOperacionesBasicas() {
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(4, calc.restar(10, 6));
        assertEquals(15, calc.multiplicar(3, 5));
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}