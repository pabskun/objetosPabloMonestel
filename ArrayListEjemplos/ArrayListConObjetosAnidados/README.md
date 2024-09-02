# 📝 Proyecto: Gestión de Personas y Métodos de Pago

Este proyecto implementa una aplicación sencilla en Java que permite la gestión de personas y sus métodos de pago. Utiliza dos clases principales: `Persona` y `MetodoPago`. Una persona puede tener múltiples métodos de pago, los cuales se almacenan en un `ArrayList` dentro de la clase `Persona`.

## 📂 Clases Principales

### 1. Clase `Persona`

La clase `Persona` representa a una persona con las siguientes propiedades:

- **Nombre**: Nombre de la persona.
- **Edad**: Edad de la persona.
- **Tarjetas**: Un `ArrayList` de objetos `MetodoPago` que representa los métodos de pago asociados a la persona.

#### Métodos de la clase `Persona`:

- `Persona(String nombre, int edad)`: Constructor para inicializar el nombre y la edad.
- `String getNombre()`: Obtiene el nombre de la persona.
- `void setNombre(String nombre)`: Establece el nombre de la persona.
- `int getEdad()`: Obtiene la edad de la persona.
- `void setEdad(int edad)`: Establece la edad de la persona.
- `ArrayList<MetodoPago> getTarjetas()`: Obtiene la lista de métodos de pago.
- `void setTarjetas(ArrayList<MetodoPago> tarjetas)`: Establece la lista de métodos de pago.
- `void agregarMetodoPago(String numero, String tipo)`: Agrega un método de pago a la lista de tarjetas.
- `String toString()`: Devuelve una representación en cadena de la persona, incluyendo sus métodos de pago.

### 2. Clase `MetodoPago`

La clase `MetodoPago` representa un método de pago con las siguientes propiedades:

- **Número**: Número del método de pago (por ejemplo, el número de tarjeta).
- **Tipo**: Tipo del método de pago (por ejemplo, "Visa", "MasterCard").

#### Métodos de la clase `MetodoPago`:

- `MetodoPago(String numero, String tipo)`: Constructor para inicializar el número y el tipo del método de pago.
- `String getNumero()`: Obtiene el número del método de pago.
- `void setNumero(String numero)`: Establece el número del método de pago.
- `String getTipo()`: Obtiene el tipo del método de pago.
- `void setTipo(String tipo)`: Establece el tipo del método de pago.
- `String toString()`: Devuelve una representación en cadena del método de pago.

## 🚀 Uso del Proyecto

### Ejemplo de uso:

```java
public class Main {
    public static void main(String[] args) {

        // Crear un objeto Persona
        Persona objPersona = new Persona("Pablo", 37);

        // Agregar métodos de pago a la persona
        objPersona.agregarMetodoPago("8888-9999-4444", "Visa");
        objPersona.agregarMetodoPago("7777-1111-6666", "MasterCard");

        // Imprimir el objeto persona completo
        System.out.println(objPersona);

        // Imprimir el primer método de pago de la persona
        System.out.println(objPersona.getTarjetas().get(0));
        System.out.println(objPersona.getTarjetas().get(1));

        // Imprimir la información del método de pago dentro de la persona
        System.out.println(objPersona.getTarjetas().get(0).getNumero());
        System.out.println(objPersona.getTarjetas().get(0).getTipo());
    }
}
```
## Salida esperada:
```plaintext
Persona{nombre='Pablo', edad=37, tarjetas=[MetodoPago{numero='8888-9999-4444', tipo='Visa'}, MetodoPago{numero='7777-1111-6666', tipo='MasterCard'}]}
MetodoPago{numero='8888-9999-4444', tipo='Visa'}
MetodoPago{numero='7777-1111-6666', tipo='MasterCard'}
8888-9999-4444
Visa
```

## 🔧 Explicación del Uso de Objetos con ArrayList
- Objeto Persona: Este objeto contiene un ArrayList de objetos MetodoPago, permitiendo que cada persona tenga múltiples métodos de pago.
- Método agregarMetodoPago: Añade un nuevo objeto MetodoPago al ArrayList dentro del objeto Persona.
- Acceso a Métodos de Pago: Utilizando getTarjetas(), se puede acceder a la lista de métodos de pago y operar con ellos, como imprimir detalles específicos.

## 🧩 Beneficios de este Enfoque
- Flexibilidad: La clase Persona puede contener múltiples métodos de pago, permitiendo una gestión eficiente de los datos.
- Modularidad: Separar las clases Persona y MetodoPago facilita la extensión y el mantenimiento del código.
- Claridad: Utilizar un ArrayList para almacenar los métodos de pago hace que el código sea más claro y más fácil de seguir.