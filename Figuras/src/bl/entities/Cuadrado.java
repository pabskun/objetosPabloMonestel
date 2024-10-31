package bl.entities;

public class Cuadrado extends Figura{
    public Cuadrado(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calcularPerimetro() {
        return this.base * 4;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.base, 2) ;
    }
}
