# 📋 Ejemplo de Uso de ArrayList con Objetos en Java

Este README explica cómo utilizar la clase `ArrayList` en Java para manejar objetos personalizados, como una lista de personas, con ejemplos prácticos de manipulación de datos dentro de la lista.

## 📚 ¿Qué es un `ArrayList`?

`ArrayList` es una clase en Java que permite crear listas dinámicas, es decir, listas que pueden cambiar de tamaño automáticamente al agregar o eliminar elementos. Esta clase es muy útil para manejar colecciones de datos donde el tamaño no es fijo.

## 🛠 Ejemplo de Uso

El ejemplo muestra cómo crear y manipular un `ArrayList` que contiene objetos de una clase personalizada `Persona`.

### 🚀 Código

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        // Agregar objetos persona a la lista
        Persona objPersona1 = new Persona("Pablo", 37);
        Persona objPersona2 = new Persona("Adriana", 29);
        Persona objPersona3 = new Persona("Helena", 83);

        personas.add(objPersona1); // Índice 0
        personas.add(objPersona2); // Índice 1
        personas.add(objPersona3); // Índice 2

        // Retornar e imprimir el elemento de una posición
        System.out.println(personas.get(1)); // Adriana - 29

        // Retornar el tamaño de un ArrayList
        personas.size(); // 3

        // Remover un elemento de una posición específica
        personas.remove(1);
        System.out.println(personas); // Pablo - 37, Helena - 83

        // Verificar si la lista está vacía
        System.out.println("¿La lista de personas está vacía? " + personas.isEmpty()); // false

        // Verificar si la lista contiene a una persona específica
        System.out.println("¿La lista de personas contiene a objPersona1? " + personas.contains(objPersona1)); // true

        // Imprimir el ArrayList usando un ciclo for tradicional
        for(int i = 0; i < personas.size(); i++){
            System.out.println("Objeto persona en la posición " + i + " " + personas.get(i));
        }

        // Imprimir el ArrayList usando un for-each
        for (Persona objPersona : personas) {
            System.out.println(objPersona.toString());
        }

        // Vaciar la lista
        personas.clear();
        System.out.println(personas);
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
```
## 🔍 Explicación de las Operaciones

- **Crear un ArrayList**: Se crea una lista llamada `personas` para almacenar objetos de la clase `Persona`.
- **Agregar Objetos**: Se agregan tres objetos `Persona` a la lista utilizando el método `add()`.
- **Acceder a Elementos**: Se obtiene e imprime un elemento específico por su índice usando `get()`.
- **Eliminar Elementos**: Se elimina un elemento en una posición específica con el método `remove()`.
- **Verificar Contenido**: Se utiliza `contains()` para comprobar si un objeto está en la lista.
- **Imprimir Lista**: Se muestran todos los elementos de la lista usando ciclos `for` y `for-each`.
- **Vaciar la Lista**: Se vacía la lista completamente con el método `clear()`.
