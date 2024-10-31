package ui;
import bl.entities.Figura;
import bl.entities.Cuadrado;
import bl.entities.Rectangulo;
import bl.entities.Triangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();

        Triangulo objT1 = new Triangulo(5,2);
        Triangulo objT2 = new Triangulo(7,3);

        Cuadrado objC1 = new Cuadrado(3,3);
        Cuadrado objC2 = new Cuadrado(9,9);

        Rectangulo objR1 = new Rectangulo(7,9);
        Rectangulo objR2 = new Rectangulo(7,11);



        listaFiguras.add(objT1);
        listaFiguras.add(objT2);
        listaFiguras.add(objC1);
        listaFiguras.add(objC2);
        listaFiguras.add(objR1);
        listaFiguras.add(objR2);

        for (Figura objF : listaFiguras){
            System.out.println("Perímetro: " + objF.calcularPerimetro());
            System.out.println("Área: " + objF.calcularArea());
            System.out.println("****---****");
        }

    }
}