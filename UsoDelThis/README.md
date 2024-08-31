# 📘 Proyecto Java: Ejemplo de Constructores con y sin el Uso de `this`

Este proyecto Java ilustra el uso de constructores con y sin la palabra clave `this` para la inicialización de objetos de la clase `Persona`.

## ✨ Descripción

El programa crea dos objetos de la clase `Persona` usando diferentes constructores:

1. 🔍 Un constructor que **no utiliza** la palabra clave `this` para la asignación de variables.
2. ✅ Un constructor que **sí utiliza** la palabra clave `this` para la asignación de variables.

El propósito es demostrar la diferencia en el comportamiento de ambos constructores al crear instancias de objetos.

## 📄 Código Principal

El archivo `Main.java` contiene el método `main` que crea dos objetos `Persona`:

```java
public class Main {
    public static void main(String[] args) {

        // Creando un objeto con un constructor sin el uso de `this`
        Persona objP1 = new Persona("Pablo");
        System.out.println("\u001B[31mImprimiendo el nombre del objeto creado con un constructor sin el uso del this");
        System.out.println("\u001B[34m" + objP1.nombre + "\n");

        // Creando un objeto con un constructor con el uso de `this`
        Persona objP2 = new Persona("Magda", 22);
        System.out.println("\u001B[32mImprimiendo el nombre del objeto creado con un constructor con el uso del this");
        System.out.println("\u001B[34m" + objP2.nombre);
    }
}
```

## 👥 Clase Persona

La clase Persona tiene dos constructores:

1. 🛠️ Constructor sin this: No asigna correctamente el nombre al objeto, ya que la palabra clave this no se utiliza para diferenciar entre la variable de instancia y el parámetro del constructor.

2. 🧩 Constructor con this: Asigna correctamente tanto el nombre como la edad al objeto usando la palabra clave this.

```java
public class Persona {
    String nombre;
    int edad;

    // Constructor sin uso de `this`
    public Persona(String nombre) {
        nombre = nombre;
    }

    // Constructor con el uso de `this`
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```

## 🖥️ Salida del Programa

El programa produce la siguiente salida, resaltando la diferencia entre los dos enfoques:

```java
Imprimiendo el nombre del objeto creado con un constructor sin el uso del this
null

Imprimiendo el nombre del objeto creado con un constructor con el uso del this
Magda
```

### 📊 Explicación
- Objeto objP1: Creado usando el constructor sin this. El nombre no se asigna correctamente, resultando en null.
- Objeto objP2: Creado usando el constructor con this. El nombre se asigna correctamente a "Magda".

### 🔍 Conclusión
- Este ejemplo resalta la importancia de usar this para referirse a las variables de instancia de una clase cuando los nombres de los - parámetros del constructor coinciden con los nombres de las variables de instancia.