public class Persona {
    private String cedula;
    private String nombre;
    private int edad;
    private char genero;

    public Persona(){
        this.cedula = null;
        this.nombre = null;
        this.edad = 0;
        this.genero = 'I';
    };
    public Persona(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public Persona(String cedula, String nombre, int edad, char genero){
        this(cedula, nombre);
        this.edad = edad;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //Éste método es el que implementa la relación de dependencia, ya que un objeto persona solamente tiene relación con otro objeto persona cuando juegan
    public String jugar(Persona objP){
        return this.nombre + " está jugando con: " + objP.getNombre();
    }
}
