public class Persona {
    String nombre;
    int edad;

    //Constructor sin uso del this
    public Persona(String nombre){
        nombre = nombre;
    }
    //Constructor con el uso del this
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
