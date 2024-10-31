package ui;

import bl.entities.Animal;
import bl.entities.Gato;
import bl.entities.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> listaAnimales = new ArrayList<Animal>();

        Perro objP1 = new Perro("001","Rocky", "Macho");
        Perro objP2 = new Perro("002","Nina", "Hembra");
        Gato objG1 = new Gato("003", "Morgana", "Hembra");
        Gato objG2 = new Gato("004", "Athos", "Macho");

        listaAnimales.add(objP1);
        listaAnimales.add(objP2);
        listaAnimales.add(objG1);
        listaAnimales.add(objG2);

        for(Animal objAnimal: listaAnimales){
            System.out.println(objAnimal.saludar());
        }

    }
}