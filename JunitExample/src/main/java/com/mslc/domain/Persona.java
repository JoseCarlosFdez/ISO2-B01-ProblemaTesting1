package com.mslc.domain;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private Nacionalidad nacionalidad;
    private Titulacion titulacion;
    private String telefono;
    private String email;

    // Constructor
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, Nacionalidad nacionalidad,
                   Titulacion titulacion, String telefono, String email) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setFechaNacimiento(fechaNacimiento);
        this.setNacionalidad(nacionalidad);
        this.setTitulacion(titulacion);
        this.setTelefono(telefono);
        this.setEmail(email);
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public Titulacion getTitulacion() {
        return titulacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.isEmpty()) {
            throw new IllegalArgumentException("Los apellidos no pueden ser vacíos");
        }
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser en el futuro");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTitulacion(Titulacion titulacion) {
        this.titulacion = titulacion;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede ser vacío");
        }
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("El correo electrónico no es válido");
        }
        this.email = email;
    }

    // Métodos de negocio
    public boolean esMayorDeEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    public boolean esEuropeo() {
        return this.nacionalidad == Nacionalidad.EUROPEA;
    }

    public boolean puedeMatricularseEnDoctorado() {
        return titulacion == Titulacion.MASTER || titulacion == Titulacion.DOCTORADO;
    }
}
