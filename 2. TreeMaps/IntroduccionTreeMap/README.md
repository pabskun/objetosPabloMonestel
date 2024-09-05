
# 📝 Explicación del Código en Java para Encontrar el Producto de Mayor Precio

Este código en Java utiliza un `TreeMap` para almacenar productos junto con sus precios y encontrar el producto más caro recorriendo todos los elementos. A continuación, se explica cada parte del código:

## 📦 1. Declaración de Importaciones
```java
import java.util.Map;
import java.util.TreeMap;
```
Importa las clases `Map` y `TreeMap` de la biblioteca `java.util`. `Map` proporciona una estructura de datos que mapea claves a valores, mientras que `TreeMap` es una implementación de `Map` que ordena los elementos en orden ascendente de clave.

## 🚀 2. Declaración de la Clase y del TreeMap
```java
public class Main {
    public static TreeMap<String, Double> listaProductos = new TreeMap<String, Double>();
}
```
Define una clase pública `Main` y declara un `TreeMap` estático llamado `listaProductos` que almacena productos (`String`) y sus precios (`Double`).

## 🏁 3. Método Principal `main`
```java
public static void main(String[] args) {
}
```
Es el punto de entrada del programa donde se ejecuta el código.

## ➕ 4. Añadir Productos al TreeMap
```java
listaProductos.put("Jabón", 2500.0);
listaProductos.put("Pan", 1500.5);
listaProductos.put("Queso", 3500.0);
listaProductos.put("Tronaditas", 700.0);
```
Añade cuatro productos y sus precios al `TreeMap` usando el método `put()`. Los elementos se almacenan en orden ascendente basado en la clave (nombre del producto).

## 🔍 5. Obtener y Mostrar el Precio de un Producto Específico
```java
System.out.println(listaProductos.get("Pan"));
```
Utiliza el método `get()` para obtener el precio del producto "Pan" y lo imprime en la consola.

## 🔄 6. Recorrer y Mostrar Todos los Elementos del TreeMap
```java
listaProductos.forEach((key, value) -> {
    System.out.println(key + " : " + value);
});
```

## 🔑 7. Mostrar las Claves del TreeMap
```java
System.out.println("********* Llaves del TreeMap *********");
System.out.println(listaProductos.keySet());
```
Muestra todas las claves del `TreeMap` usando `keySet()`, que devuelve un conjunto de todas las claves.

## 💵 8. Mostrar los Valores del TreeMap
```java
System.out.println("********* Valores del TreeMap *********");
System.out.println(listaProductos.values());
```

## 🏆 9. Encontrar el Producto con el Mayor Precio
```java
double mayorPrecio = 0.0;
String productoMasCaro = "";

for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
    String key = producto.getKey();
    Double value = producto.getValue();

    if (value > mayorPrecio) {
        mayorPrecio = value;
        productoMasCaro = key;
    }
}
```
- Inicializa dos variables: `mayorPrecio` para almacenar el precio más alto encontrado y `productoMasCaro` para almacenar el nombre del producto más caro.
- Utiliza un bucle `for` para recorrer cada entrada del `TreeMap` (`entrySet()` devuelve un conjunto de entradas de clave-valor).
- Compara el precio de cada producto (`value`) con el `mayorPrecio` actual y actualiza si es mayor.

## 📢 10. Imprimir el Producto con el Mayor Precio
```java
System.out.println(productoMasCaro); 
```
Imprime el nombre del producto con el mayor precio en la consola. En este caso, el resultado será "Queso".

---

## 🧠 11. Encontrar el Producto con el Mayor Precio usando `AtomicReference` y `forEach` con Lambda
### ¿Qué Hace Este Código?

El siguiente código tiene la tarea de encontrar cuál es el producto más caro en una lista de productos y sus precios. Utiliza `AtomicReference` para gestionar las referencias de forma segura en entornos concurrentes.

### 📌 1. ¿Qué es `AtomicReference`?

`AtomicReference` es una clase que permite trabajar con referencias de objetos de manera segura en entornos concurrentes. En este caso, se usan dos `AtomicReference` para guardar el precio más alto y el nombre del producto más caro.

### 🧰 2. Crear las Referencias Atómicas

```java
AtomicReference<Double> atomicMayorPrecio = new AtomicReference<>(0.0);
AtomicReference<String> atomicProductoMasCaro = new AtomicReference<>("");
```
- `atomicMayorPrecio` guarda el precio más alto encontrado, comenzando con `0.0`.
- `atomicProductoMasCaro` guarda el nombre del producto más caro encontrado, comenzando vacío.

### 🔄 3. Revisar Todos los Productos
Revisa cada producto y su precio uno por uno.

```java
listaProductos.forEach((key, value) -> {
    if (value > atomicMayorPrecio.get()) {
        atomicMayorPrecio.set(value);
        atomicProductoMasCaro.set(key);
    }
});
```
- Recorre cada entrada de `listaProductos`.
- Si el precio actual (`value`) es mayor que el almacenado en `atomicMayorPrecio`, actualiza ambos.

### 📢 4. Mostrar el Producto Más Caro
```java
System.out.println(atomicProductoMasCaro.get());
```
Muestra el nombre del producto más caro encontrado.
