public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anno;

    public Vehiculo(String placa){
        this.placa = placa;
    }
    public Vehiculo(String placa, String marca){
        this(placa);
        this.marca = marca;
    }
    public Vehiculo(String placa, String marca, String modelo, int anno){
        this(placa, marca);
        this.modelo = modelo;
        this.anno = anno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String encender(){
        return "El vehículo placa: " + this.getPlaca() + " y marca " + this.getMarca() + " está encendido...";
    }
    public String circular(){
        String msj = this.encender();
        msj += " y va a ser manejado por ";
        return msj;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anno=" + anno +
                '}';
    }
}
