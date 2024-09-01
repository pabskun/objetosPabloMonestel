# 🚗 Sistema de Manejo de Personas y Vehículos

Este proyecto demuestra una relación de **dependencia** entre las clases `Persona` y `Vehiculo` a través de un sencillo sistema en Java. El programa permite crear instancias de personas y vehículos y simula la acción de manejar un vehículo por parte de una persona.

## 📋 Descripción de las Clases

### **1. Persona**
- **Atributos:**
  - `cedula`: Identificación única de la persona.
  - `nombre`: Nombre de la persona.
  - `edad`: Edad de la persona.
  - `genero`: Género de la persona.
- **Constructores:**
  - Constructor por defecto.
  - Constructor que recibe `cedula` y `nombre`.
  - Constructor que recibe todos los atributos.
- **Métodos:**
  - Métodos de acceso (`get`) y modificación (`set`) para cada atributo.
  - **Método `manejar(Vehiculo objV)`**: Establece la relación de dependencia con la clase `Vehiculo`. Este método toma un objeto `Vehiculo` y devuelve un mensaje indicando que el vehículo está siendo manejado por la persona.

### **2. Vehiculo**
- **Atributos:**
  - `placa`: Placa del vehículo.
  - `marca`: Marca del vehículo.
  - `modelo`: Modelo del vehículo.
  - `anno`: Año de fabricación del vehículo.
- **Constructores:**
  - Constructor que recibe solo `placa`.
  - Constructor que recibe `placa` y `marca`.
  - Constructor que recibe todos los atributos.
- **Métodos:**
  - Métodos de acceso (`get`) y modificación (`set`) para cada atributo.
  - **Método `encender()`**: Devuelve un mensaje indicando que el vehículo está encendido.
  - **Método `circular()`**: Usa el método `encender()` y devuelve un mensaje indicando que el vehículo está siendo manejado por una persona.
  - Método `toString()`: Devuelve una representación en cadena del objeto `Vehiculo`.

## 🔄 Relación de Dependencia

La **dependencia** entre `Persona` y `Vehiculo` se establece en el método `manejar()` de la clase `Persona`. Este método recibe un objeto `Vehiculo` como parámetro y utiliza su método `circular()` para crear una interacción:

- Una **Persona** depende de un **Vehiculo** para realizar la acción de manejar.
- Un **Vehiculo** es manejado por una **Persona**, pero la clase `Vehiculo` no necesita conocer a la **Persona** directamente, demostrando así una relación de dependencia unidireccional.

## 🌟 Ejemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Persona objPersona1 = new Persona("111","Pablo");
        Persona objPersona2 = new Persona("222","Isabel");
        Vehiculo objVehiculo1 = new Vehiculo("abc-123", "Hyundai");
        Vehiculo objVehiculo2 = new Vehiculo("def-456", "Nissan", "Versa", 2020);

        // Llamadas a los métodos manejar que implementan la relación de dependencia entre Persona y Vehículo
        System.out.println(objPersona1.manejar(objVehiculo1));
        System.out.println(objPersona2.manejar(objVehiculo2));
    }
}
```

## 📝 Salida Esperada

```java
El vehículo placa: abc-123 y marca Hyundai está encendido... y va a ser manejado por Pablo
El vehículo placa: def-456 y marca Nissan está encendido... y va a ser manejado por Isabel
```


## 📚 Conclusión
Este ejemplo simple en Java muestra cómo una Persona puede depender de un Vehiculo para realizar la acción de manejar, destacando una relación de dependencia entre objetos en la programación orientada a objetos. Este tipo de relaciones son fundamentales para modelar interacciones del mundo real en aplicaciones de software.