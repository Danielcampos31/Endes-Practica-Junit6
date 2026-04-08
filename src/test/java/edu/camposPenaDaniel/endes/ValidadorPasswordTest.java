package edu.camposPenaDaniel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPasswordTest {

    private final ValidadorPassword val = new ValidadorPassword();

    @Test
    void testPasswordSegura() {
        assertTrue(val.esSegura("Segura123"));
    }

    @Test
    void testPasswordInsegura() {
        assertFalse(val.esSegura("corta1"));
        assertFalse(val.esSegura("solominusculas123"));
        assertFalse(val.esSegura("SINNUMEROS"));
        assertFalse(val.esSegura(null));
    }
}