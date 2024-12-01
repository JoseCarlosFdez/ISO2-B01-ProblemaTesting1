package com.mslc.ui;

import com.mslc.domain.Persona;
import com.mslc.domain.Nacionalidad;
import com.mslc.domain.Titulacion;
import com.mslc.service.PersonaService;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonaApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Mostrar mensaje de bienvenida
        System.out.println("Bienvenido a la aplicación de Gestión de Personas");

        // Leer los datos de la persona
        String nombre = leerString("Ingrese el nombre: ");
        String apellidos = leerString("Ingrese los apellidos: ");
        LocalDate fechaNacimiento = leerFecha("Ingrese la fecha de nacimiento (formato: yyyy-MM-dd): ");
        Nacionalidad nacionalidad = leerNacionalidad();
        Titulacion titulacion = leerTitulacion();
        String telefono = leerString("Ingrese el número de teléfono: ");
        String email = leerString("Ingrese el correo electrónico: ");

        // Crear la persona
        Persona persona = new Persona(nombre, apellidos, fechaNacimiento, nacionalidad,
                                      titulacion, telefono, email);

        // Crear el servicio de persona
        PersonaService personaService = new PersonaService();

        // Mostrar los resultados
        imprimirPersona(persona);
        System.out.println("\n¿Es mayor de edad? " + personaService.esMayorDeEdad(persona));
        System.out.println("¿Es europeo? " + personaService.esEuropeo(persona));
        System.out.println("¿Puede matricularse en doctorado? " + personaService.puedeMatricularseEnDoctorado(persona));
    }

    // Métodos para leer la entrada desde consola
    private static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    private static LocalDate leerFecha(String mensaje) {
        System.out.print(mensaje);
        String fecha = scanner.nextLine();
        return LocalDate.parse(fecha);
    }

    private static Nacionalidad leerNacionalidad() {
        System.out.println("Seleccione la nacionalidad:");
        System.out.println("1. Europea");
        System.out.println("2. No Europea");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return opcion == 1 ? Nacionalidad.EUROPEA : Nacionalidad.NO_EUROPEA;
    }

    private static Titulacion leerTitulacion() {
        System.out.println("Seleccione la titulación:");
        System.out.println("1. Grado");
        System.out.println("2. Máster");
        System.out.println("3. Doctorado");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        switch (opcion) {
            case 1: return Titulacion.GRADO;
            case 2: return Titulacion.MASTER;
            case 3: return Titulacion.DOCTORADO;
            default: throw new IllegalArgumentException("Titulación no válida");
        }
    }

    // Método para imprimir la persona
    private static void imprimirPersona(Persona persona) {
        System.out.println("\nInformación de la Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
        System.out.println("Titulación: " + persona.getTitulacion());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Email: " + persona.getEmail());
    }
}
