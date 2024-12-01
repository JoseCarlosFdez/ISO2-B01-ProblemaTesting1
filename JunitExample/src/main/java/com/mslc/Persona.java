package com.mslc;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        // Constructor vacío
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellidos, int edad) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setEdad(edad);
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", apellidos='" + apellidos + '\'' +
               ", edad=" + edad +
               '}';
    }
}

