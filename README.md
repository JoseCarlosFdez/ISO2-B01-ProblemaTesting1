# Problema 1 - Proyecto de Validación de Personas

Este proyecto corresponde al **Problema 1** del trabajo teórico. En este ejercicio, se implementa una clase `Persona` junto con su respectiva clase `PersonaValidador` para realizar ciertas validaciones sobre los datos de una persona.

## Descripción

El objetivo de este proyecto es desarrollar las clases Java necesarias para modelar una persona y validar ciertos aspectos de su información, como el nombre, los apellidos y la edad.

### Clases principales

- **Persona**: Esta clase representa a una persona y contiene los atributos `nombre`, `apellidos` y `edad`. Además, incluye los métodos getter y setter para cada atributo.
- **PersonaValidador**: Esta clase contiene métodos estáticos para realizar validaciones sobre los atributos de la clase `Persona`. Se incluyen validaciones como si la persona es mayor de edad, si tiene un nombre y apellidos válidos, y si es completamente válida.

### Validaciones

Las validaciones realizadas por la clase `PersonaValidador` son las siguientes:

1. **Mayor de edad**: Verifica si la persona es mayor o igual a 18 años.
2. **Nombre válido**: Verifica que el nombre no sea `null` ni vacío.
3. **Apellidos válidos**: Verifica que los apellidos no sean `null` ni vacíos.
4. **Persona válida**: Comprueba si la persona cumple con todas las validaciones anteriores.

### Archivos clave

- **`Persona.java`**: Define los atributos `nombre`, `apellidos`, y `edad` junto con los métodos getter y setter. Además, tiene un control básico de validaciones como que la edad no sea negativa.
- **`PersonaValidador.java`**: Contiene las funciones estáticas para validar las propiedades de la clase `Persona`.
- **`pom.xml`**: Archivo de configuración para Maven, que gestiona las dependencias y la compilación del proyecto.



