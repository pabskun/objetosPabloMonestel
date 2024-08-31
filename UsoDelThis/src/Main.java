
public class Main {
    public static void main(String[] args) {

        //Creando un objeto que no tiene la palabra this dentro del constructor
        Persona objP1 = new Persona("Pablo");
        System.out.println("\u001B[31mImprimiendo el nombre del objeto creado con un constructor sin el uso del this");
        System.out.println("\u001B[34m"+objP1.nombre +"\n");

        //Creando un objeto que no tiene la palabra this dentro del constructor
        Persona objP2 = new Persona("Magda",22);
        System.out.println("\u001B[32mImprimiendo el nombre del objeto creado con un constructor con el uso del this");
        System.out.println("\u001B[34m"+ objP2.nombre);
    }
}