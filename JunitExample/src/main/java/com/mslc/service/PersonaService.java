package com.mslc.service;

import com.mslc.domain.Persona;

public class PersonaService {
    
    // Método para verificar si una persona puede ser matriculada en un doctorado
    public boolean puedeMatricularseEnDoctorado(Persona persona) {
        return persona.puedeMatricularseEnDoctorado();
    }
    
    // Método para verificar si una persona es mayor de edad
    public boolean esMayorDeEdad(Persona persona) {
        return persona.esMayorDeEdad();
    }
    
    // Método para verificar si una persona es europea
    public boolean esEuropeo(Persona persona) {
        return persona.esEuropeo();
    }
}
