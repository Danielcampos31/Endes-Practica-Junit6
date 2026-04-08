package edu.camposPenaDaniel.endes;

/**
 * Clase que proporciona operaciones aritméticas básicas.
 */
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros. Lanza excepción si el divisor es 0.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return (double) a / b;
    }
}