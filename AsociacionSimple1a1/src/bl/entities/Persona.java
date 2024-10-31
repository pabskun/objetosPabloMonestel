package bl.entities;

public class Persona {
    private String cedula;
    private String nombre;
    private int edad;
    private char genero;
    private Tarjeta tarjeta; //Se establece la relación de 1 a 1 con el objeto tarjeta

    public Persona(String cedula, String nombre, int edad, char genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public Persona(String cedula, String nombre, int edad, char genero, Tarjeta tarjeta) {
        this(cedula, nombre, edad, genero);
        this.tarjeta = tarjeta;
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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", tarjeta=" + tarjeta +
                '}';
    }
}
