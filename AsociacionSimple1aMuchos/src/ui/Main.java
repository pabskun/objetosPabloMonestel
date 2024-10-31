package ui;


import bl.entities.Persona;
import bl.entities.Tarjeta;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("111", "Pablo", 36,'M');

        Tarjeta tarjeta1 = new Tarjeta("000123", "Visa");


        Tarjeta tarjeta2 = new Tarjeta("000456", "Amex");

        persona1.agregarTarjeta(tarjeta1);
        persona1.agregarTarjeta(tarjeta2);

        for(Tarjeta tarjeta: persona1.getTarjetas()){
            System.out.println(tarjeta.getNumero());
            System.out.println(tarjeta.getMarca());
        }
    }
}