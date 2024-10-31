package ui;

import bl.entities.Persona;
import bl.entities.Tarjeta;

public class Main {
    public static void main(String[] args) {
        //Primera forma de construir el objeto persona con la tarjeta
        Persona persona1 = new Persona("111","Alexandra",27, 'F');
        Tarjeta tarjeta1 = new Tarjeta("00123", "Visa");

        //Asociar el objeto tarjeta al objeto persona
        persona1.setTarjeta(tarjeta1);

        //Imprimir el objeto persona 1
        System.out.println(persona1.toString());


        //Segunda forma de construir el objeto persona con la tarjeta
        Tarjeta tarjeta2 = new Tarjeta("00456", "Amex");
        Persona persona2 = new Persona("222","Patricia", 41,'F', tarjeta2);

        System.out.println(persona2.toString());

        //Imprimir el número y marca de la tarjeta de la persona2, usando únicamente los métodos get()
        System.out.println(persona2.getTarjeta().getNumero());
        System.out.println(persona2.getTarjeta().getMarca());
    }
}