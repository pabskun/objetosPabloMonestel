# 📝 Proyecto relación de dependencia entre objetos Persona

Este proyecto consta de dos clases en Java: `Main` y `Persona`. El propósito de este proyecto es demostrar una relación de dependencia entre objetos a través del método `jugar`.

## 🚀 Estructura del Proyecto

### 📄 Clase `Main`

La clase `Main` contiene el método `main`, que es el punto de entrada del programa. Dentro de este método se crean dos instancias de la clase `Persona`:

- `objP1` con cédula "111" y nombre "Pablo".
- `objP2` con cédula "222", nombre "Paula", edad 29 y género 'F'.

Posteriormente, se llama al método `jugar` de `objP1`, pasando como argumento `objP2`, lo que ejemplifica la relación de dependencia entre ambos objetos.

### 📄 Clase `Persona`

La clase `Persona` representa una entidad con los siguientes atributos:

- `cedula` (String): Identificación única de la persona.
- `nombre` (String): Nombre de la persona.
- `edad` (int): Edad de la persona.
- `genero` (char): Género de la persona ('F', 'M', 'I').

#### 🛠️ Constructores

La clase `Persona` proporciona tres constructores:

1. Constructor sin parámetros que inicializa todos los atributos a valores predeterminados.
2. Constructor que acepta `cedula` y `nombre`.
3. Constructor que acepta `cedula`, `nombre`, `edad` y `genero`, y reutiliza el segundo constructor para inicializar los atributos comunes.

#### 🏃‍♂️ Método `jugar`

El método `jugar` establece la relación de dependencia entre dos objetos de la clase `Persona`. Este método toma otro objeto `Persona` como parámetro y devuelve un mensaje indicando que ambas personas están "jugando" juntas:

```java
public String jugar(Persona objP){
    return this.nombre + " está jugando con: " + objP.getNombre();
}
```

## 🔗 Relación de Dependencia
La relación de dependencia se manifiesta en el método jugar. La clase Persona depende de otra instancia de sí misma para ejecutar una acción conjunta (jugar). Esta dependencia es un ejemplo de cómo un objeto necesita de otro objeto para realizar una determinada funcionalidad.

## 🌟 Ejecución del Proyecto
Para ejecutar este proyecto:

1. Compila las clases Main y Persona.
2. Ejecuta el programa desde la clase Main para observar cómo objP1 juega con objP2.

## 🖥️ Ejemplo de Salida
```plaintext
Pablo está jugando con: Paula
```

## 📜 Conclusión
Este proyecto ilustra cómo se puede implementar una relación de dependencia en Java mediante el uso de métodos que interactúan con otros objetos. La clase Persona depende de otra instancia de Persona para ejecutar su método jugar, demostrando una interacción simple pero eficaz entre objetos.
