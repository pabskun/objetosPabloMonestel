package bl.entities;

public class Tarjeta {
    private String numero;
    private String marca;

    public Tarjeta(String numero, String marca) {
        this.numero = numero;
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numero='" + numero + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
