package monestel.pablo.bl.entities;

public class Cliente extends Persona{
    private String correo;
    private double saldo;

    public Cliente(String cedula, String nombre, int edad, String correo, double saldo){
        super(cedula, nombre, edad);
        this.correo = correo;
        this.saldo = saldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "correo='" + correo + '\'' +
                ", saldo=" + saldo +
                "} " + super.toString();
    }
}
