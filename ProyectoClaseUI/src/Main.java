import monestel.pablo.bl.entities.Cliente;
import monestel.pablo.bl.entities.Persona;
import monestel.pablo.bl.logic.Gestor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Gestor gestor = new Gestor();
    public static void main(String[] args) throws Exception {
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar una persona");
            System.out.println("2. Imprimir lista de personas");
            System.out.println("3. Eliminar una persona");
            System.out.println("4. Registrar un cliente");
            System.out.println("5. Imprimir lista de clientes");
            System.out.println("6. Asociar proyecto a cliente");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    leerDatosPersona();
                    break;
                case 2:
                    imprimirListaPersonas();
                    break;
                case 3:
                    borrarPersona();
                    break;
                case 4:
                    leerDatosCliente();
                    break;
                case 5:
                    imprimirListaClientes();
                    break;
                case 6:
                    asociarProyectoACliente();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

    }

    public static void leerDatosPersona(){
        try{
            System.out.println("Ingrese la cédula: ");
            String cedula = scanner.nextLine();

            System.out.println("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            String msj = gestor.agregarPersona(cedula, nombre, edad);
            System.out.println(msj);
        }catch(InputMismatchException e){
            System.out.println("Alguno de los datos ingresados no cuenta con el formato correcto.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void imprimirListaPersonas() throws Exception {
        ArrayList<Persona> listaPersonas = gestor.obtenerListaPersonas();

        for(Persona persona : listaPersonas){
            System.out.println(persona.toString());
        }
    }

    public static void borrarPersona() throws Exception {
        System.out.println("Por favor ingrese la cédula de la persona que desea eliminar: ");
        String cedula = scanner.nextLine();
        String msj = gestor.eliminarPersona(cedula);
        System.out.println(msj);
    }

    public static void leerDatosCliente(){
        try{
            System.out.println("Ingrese la cédula: ");
            String cedula = scanner.nextLine();

            System.out.println("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el correo: ");
            String correo = scanner.nextLine();

            System.out.println("Ingrese el saldo: ");
            double saldo = Double.parseDouble(scanner.nextLine());

            String msj = gestor.agregarCliente(cedula, nombre, edad, correo,saldo);
            System.out.println(msj);
        }catch(InputMismatchException e){
            System.out.println("Alguno de los datos ingresados no cuenta con el formato correcto.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void imprimirListaClientes() throws Exception {
        ArrayList<Cliente> listaClientes = gestor.obtenerListaClientes();

        for(Cliente cliente : listaClientes){
            System.out.println(cliente.toString());
        }
    }
    public static void asociarProyectoACliente() throws Exception{
        System.out.println("Ingrese la cédula del cliente: ");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese el id del proyecto: ");
        int id = Integer.parseInt(scanner.nextLine());

        gestor.asociarProyectoACliente(cedula,id);
    }
}