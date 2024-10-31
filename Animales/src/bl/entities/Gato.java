package bl.entities;

public class Gato extends Animal {
    public Gato(String codigo, String nombre, String sexo) {
        super(codigo, nombre, sexo);
    }

    public String saludar(){
        return "Hola soy " + this.nombre + " miau - miau";
    }

    @Override
    public String toString() {
        return "Gato{} " + super.toString();
    }
}
