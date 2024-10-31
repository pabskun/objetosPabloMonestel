package bl.entities;

public abstract class Animal {
    protected String codigo;
    protected String nombre;
    protected String sexo;

    public Animal(String codigo, String nombre, String sexo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public abstract String saludar();

    @Override
    public String toString() {
        return "Animal{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
