package bl.entities;

import java.sql.Date;

public class Persona {

    // Atributos privados
    private String nombre;
    private Date nacimiento;
    private String correo;
    private String contrasenna;
    private int edad;
    private double cantDinero;

    // Constructor
    public Persona(String nombre, Date nacimiento, String correo, String contrasena) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.contrasenna = contrasena;
        this.edad = calcularEdad(nacimiento);
    }
    public Persona(String nombre, Date nacimiento, String correo, String contrasena, double cantDinero) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.contrasenna = contrasena;
    }

    // Método para calcular la edad
    public int calcularEdad(Date fechaActual) {
        // Implementación para calcular la edad basándose en la fecha de nacimiento y la fecha actual
        // Esto es solo un ejemplo básico y puede necesitar ajustes según los requisitos exactos
        int edad = (int) (fechaActual.getTime() - nacimiento.getTime());

        return edad;
    }

    // Getters y setters opcionales para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(double cantDinero) {
        this.cantDinero = cantDinero;
    }


}
