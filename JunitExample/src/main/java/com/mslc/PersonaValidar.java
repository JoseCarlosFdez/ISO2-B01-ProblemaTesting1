package com.mslc;

public class PersonaValidar {

    public static boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public static boolean tieneNombreValido(Persona persona) {
        return persona.getNombre() != null && !persona.getNombre().isEmpty();
    }

    public static boolean tieneApellidosValidos(Persona persona) {
        return persona.getApellidos() != null && !persona.getApellidos().isEmpty();
    }

    public static boolean esValida(Persona persona) {
        return esMayorDeEdad(persona) && tieneNombreValido(persona) && tieneApellidosValidos(persona);
    }
}
