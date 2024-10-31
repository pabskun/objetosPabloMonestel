package bl.entities;

public class Rombo extends Figura{

    public Rombo(double base, double altura){
        super(base, altura);
    }
    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return this.base * 4;
    }
}
