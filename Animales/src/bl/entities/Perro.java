package bl.entities;

public class Perro extends Animal{

    private String raza;
    public Perro(String codigo, String nombre, String sexo) {
        super(codigo, nombre, sexo);
    }

    public String saludar(){
        return  "Hola me llamo "+ this.nombre + " guau - guau";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                "} " + super.toString();
    }
}
