📚 Java Collections Guide
Este repositorio proporciona una guía detallada sobre el uso de ArrayList y Map en Java, incluyendo ejemplos y explicaciones sobre sus características, métodos, ventajas y desventajas.

🚀 ArrayList
Los ArrayList son una estructura de datos dinámica en Java, que permite agregar o eliminar elementos según sea necesario.

Importar la clase ArrayList
Para usar ArrayList, es necesario importar el paquete correspondiente:

java
Copy code
import java.util.ArrayList;
Características de ArrayList
Capacidad dinámica: Permite agregar o eliminar elementos sin un tamaño fijo.
Índices iniciados en cero.
Tipo de datos genérico: Puede contener datos primitivos u objetos.
Ejemplos de uso
ArrayList Genérico:

java
Copy code
ArrayList listaGenerica = new ArrayList<>();
ArrayList Tipado:

java
Copy code
ArrayList<String> listaDeStrings = new ArrayList<String>();
ArrayList de Objetos:

java
Copy code
ArrayList<Persona> listaDeObjetos = new ArrayList<Persona>();
Métodos Comunes de ArrayList
add(E e): Añade un elemento al final de la lista.
get(int index): Retorna el elemento en la posición especificada.
remove(int index): Elimina el elemento en la posición indicada.
size(): Retorna el tamaño del ArrayList.
isEmpty(): Verifica si la lista está vacía.
contains(Object o): Verifica si un elemento está en la lista.
clear(): Vacía la lista.
Ventajas y Desventajas de ArrayList
Ventajas:

Flexibilidad para agregar o eliminar elementos dinámicamente.
Facilidad de uso gracias a sus métodos integrados.
Desventajas:

Rendimiento más lento al agregar o eliminar elementos en el medio de la lista.
🌳 Map
Los Map son colecciones en Java que asocian claves únicas con valores.

Importar la clase TreeMap
Para usar TreeMap, es necesario importar el paquete correspondiente:

java
Copy code
import java.util.TreeMap;
Tipos de Map
HashMap <K,V>: Almacena conjuntos clave-valor sin un orden específico.
TreeMap <K,V>: Utiliza una estructura de árbol para ordenar las claves.
LinkedHashMap <K,V>: Similar al HashMap, pero mantiene el orden de inserción.
Ejemplos de uso
Crear un TreeMap con llave y valor String:

java
Copy code
TreeMap<String, String> personas = new TreeMap<>();
personas.put("111", "Pablo");
Crear un TreeMap con llave Integer y valor String:

java
Copy code
TreeMap<Integer, String> provincias = new TreeMap<>();
provincias.put(1, "San José");
provincias.put(2, "Cartago");
Métodos Comunes de Map
put(K key, V value): Asocia el valor a la clave especificada.
get(Object key): Retorna el valor asociado a la clave indicada.
remove(Object key): Elimina la asociación para la clave indicada.
containsKey(Object key): Verifica si una clave está presente.
containsValue(Object value): Verifica si un valor específico está presente.
size(): Retorna la cantidad de asociaciones.
keySet(): Devuelve una vista de las claves.
values(): Devuelve una colección de los valores.
📝 Contribuciones
¡Las contribuciones son bienvenidas! No dudes en abrir un pull request o reportar issues.

📄 Licencia
Este proyecto está bajo la licencia MIT.