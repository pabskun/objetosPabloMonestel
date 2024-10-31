package bl.entities;

public class Rectangulo extends Figura{
    public Rectangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calcularPerimetro() {
        return (this.base * 2) + (this.altura * 2);
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
