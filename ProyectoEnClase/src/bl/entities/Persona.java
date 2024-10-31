package bl.entities;

public class Persona {
    private String cedula;
    private String nombre;
    private String correo;
    private String telefono;

    //Método constructor
    public Persona(String cedula, String nombre, String correo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
    }

    //Método constructor sobrecargado
    public Persona(String cedula, String nombre, String correo, String telefono){
        this(cedula, nombre, correo);//Se llama al método constructor que tiene los parámetros equivalentes para que los inicialice
        this.telefono = telefono;
    }

    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
