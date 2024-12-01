# Proyecto de Validación de Personas

Este proyecto corresponde al **Problema 1** del trabajo teórico. El objetivo de este ejercicio es desarrollar las clases Java necesarias para modelar una persona y validar ciertos aspectos de su información, como su nombre, apellidos, edad, nacionalidad y titulación.

## Descripción

Este proyecto implementa una clase `Persona` que modela a una persona con atributos como su nombre, apellidos, fecha de nacimiento, nacionalidad, titulación, teléfono y correo electrónico. Además, incluye la clase `PersonaService` para realizar varias validaciones sobre estos atributos, como si la persona es mayor de edad, si es europea, y si puede matricularse en un programa de doctorado basado en su titulación.

### Clases principales

- **Persona**: Esta clase representa a una persona y contiene los atributos:
  - `nombre`
  - `apellidos`
  - `fechaNacimiento`
  - `nacionalidad`
  - `titulacion`
  - `telefono`
  - `email`
  
  La clase incluye los métodos getter y setter para cada atributo, así como las validaciones básicas para asegurar que la información sea válida.

- **PersonaService**: Esta clase contiene los métodos que realizan las validaciones sobre los atributos de la clase `Persona`. Las validaciones incluyen:
  1. **Mayor de edad**: Verifica si la persona tiene 18 años o más.
  2. **Es europeo**: Verifica si la persona tiene una nacionalidad europea.
  3. **Puede matricularse en doctorado**: Verifica si la persona tiene una titulación igual o superior a un máster.
  
- **PersonaApp**: Clase principal que gestiona la interfaz de usuario en línea de comandos. Permite ingresar los datos de una persona, mostrando los resultados de las validaciones realizadas.

### Validaciones

Las validaciones realizadas por la clase `PersonaService` son las siguientes:

1. **Mayor de edad**: Verifica si la persona tiene 18 años o más, usando la fecha de nacimiento.
2. **Es europeo**: Verifica si la nacionalidad de la persona es europea.
3. **Puede matricularse en doctorado**: Verifica si la persona tiene una titulación igual o superior a un máster (de acuerdo con los requisitos del ejercicio).

