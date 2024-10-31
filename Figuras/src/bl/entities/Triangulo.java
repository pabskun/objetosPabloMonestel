package bl.entities;

public class Triangulo extends Figura{

    public Triangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        perimetro = this.base * 3; //Se da por supuesto que la base equivale al valor de los lados
        return perimetro;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura /2;
    }
}
