# 📚 Guiá de Colecciones de Java

Este repositorio proporciona una guía detallada sobre el uso de **ArrayList** y **Map** en Java, incluyendo ejemplos y explicaciones sobre sus características, métodos, ventajas y desventajas.

## 🚀 ArrayList

Los **ArrayList** son una estructura de datos dinámica en Java, que permite agregar o eliminar elementos según sea necesario.

### Importar la clase ArrayList

Para usar **ArrayList**, es necesario importar el paquete correspondiente:

```java
import java.util.ArrayList;
```
## Características de los ArrayList

- **Capacidad dinámica**: En lugar de tener un tamaño fijo, se le pueden agregar o eliminar elementos según la necesidad.
- **Índices**: Inician en cero.
- **Tipos de datos**: Pueden contener cualquier tipo de dato, ya sean datos primitivos u objetos.
- **Genéricos**: Los ArrayList pueden almacenar tipos de datos u objetos genéricos, pero además se puede especificar el tipo de elementos que contiene.

### ArrayList genérico

```java
ArrayList listaGenerica = new ArrayList<>();
```

### ArrayList Tipado:

```java
ArrayList<String> listaDeStrings = new ArrayList<String>();
```
### ArrayList de Objetos:

```java
ArrayList<Persona> listaDeObjetos = new ArrayList<Persona>();
```

### Métodos de acceso y modificación de los ArrayList

| Método              | Definición                                                       |
|---------------------|-----------------------------------------------------------------|
| `add(E e)`          | Añade un elemento al final de la lista                           |
| `get(int index)`    | Retorna el elemento que se encuentra en la posición especificada |
| `remove(int index)` | Elimina el elemento que se encuentra en la posición indicada     |
| `size()`            | Retorna el tamaño (cantidad de elementos) del **ArrayList**      |
| `isEmpty()`         | Verifica si la lista está vacía                                  |
| `contains(Object o)`| Verifica si un elemento se encuentra dentro de la lista          |
| `clear()`           | Vacía la lista                                                   |

