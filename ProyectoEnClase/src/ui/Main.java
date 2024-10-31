package ui;

import bl.entities.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        Persona objP1 = new Persona("111","Pablo", "pablo@gmail.com"); //Primera instancia de la clase Persona
        Persona objP2 = new Persona("222", "Kianny", "kianny@gmail.com"); //Segunda instancia de la clase Persona

        Persona objP3 = new Persona("333", "Agata", "agata@gmail.com", "8888-9999");

        listaPersonas.add(objP1);
        listaPersonas.add(objP2);
        listaPersonas.add(objP3);

        //Creación del objetoP4 mediante solicitud de datos al usuario
        System.out.println("Ingrese la cédula de la persona a registrar: ");
        String cedula = scanner.next();
        System.out.println("Ingrese el nombre de la persona a registrar: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el correo de la persona a registrar: ");
        String correo = scanner.next();

        Persona objP4 = new Persona(cedula, nombre, correo);
        listaPersonas.add(objP4);



        for(Persona objPersona : listaPersonas){
            System.out.println("Cédula: " + objPersona.getCedula() + " Nombre: " + objPersona.getNombre() + " Correo: " + objPersona.getCorreo() + " Telefono: " + objPersona.getTelefono());
        }


    }
}