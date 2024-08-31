# 🌳 Map

Los Map son colecciones en Java que asocian claves únicas con valores.

## Importar la clase TreeMap

Para usar `TreeMap`, es necesario importar el paquete correspondiente:

```java
import java.util.TreeMap;
```
## Tipos de Map
- **HashMap<K,V>**: Almacena conjuntos clave-valor sin un orden específico.
- **TreeMap<K,V>**: Utiliza una estructura de árbol para ordenar las claves.
- **LinkedHashMap<K,V>**: Similar al HashMap, pero mantiene el orden de inserción.

## Ejemplos de uso

### Crear un TreeMap con llave y valor String:

```java
TreeMap<String, String> personas = new TreeMap<>();
personas.put("111", "Pablo");
```


### Crear un TreeMap con llave Integer y valor String:
```java
TreeMap<Integer, String> provincias = new TreeMap<>();
provincias.put(1, "San José");
provincias.put(2, "Cartago");
```

## Métodos Comunes de Map

| Método                      | Descripción                                               |
|-----------------------------|-----------------------------------------------------------|
| `put(K key, V value)`       | Asocia el valor a la clave especificada.                  |
| `get(Object key)`           | Retorna el valor asociado a la clave indicada.            |
| `remove(Object key)`        | Elimina la asociación para la clave indicada.             |
| `containsKey(Object key)`   | Verifica si una clave está presente.                      |
| `containsValue(Object value)` | Verifica si un valor específico está presente.           |
| `size()`                    | Retorna la cantidad de asociaciones.                      |
| `keySet()`                  | Devuelve una vista de las claves.                         |
| `values()`                  | Devuelve una colección de los valores.                    |