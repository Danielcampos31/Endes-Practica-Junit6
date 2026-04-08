package edu.camposPenaDaniel.endes;

/**
 * Valida la seguridad de una contraseña.
 */
public class ValidadorPassword {

    /**
     * Comprueba longitud mínima, mayúsculas y números.
     */
    public boolean esSegura(String password) {
        if (password == null) {
            return false;
        }
        // Al menos una mayúscula, un número y mínimo 8 caracteres
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}