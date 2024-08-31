import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private ArrayList<MetodoPago> tarjetas = new ArrayList<MetodoPago>();

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

    public ArrayList<MetodoPago> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<MetodoPago> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public void agregarMetodoPago(String numero, String tipo){
        MetodoPago objMetodoPago = new MetodoPago(numero, tipo);
        this.tarjetas.add(objMetodoPago);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tarjetas=" + tarjetas +
                '}';
    }
}
