package bl.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private Date nacimiento;
    private String correo;
    private int edad;

    public Persona(String nombre, Date nacimiento, String correo){
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.edad = calcularEdad(this.nacimiento);
    }

    private int calcularEdad(Date nacimiento){
        LocalDate fechaNacimiento = LocalDate.from(nacimiento.toInstant());
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        return edad;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                '}';
    }
}
