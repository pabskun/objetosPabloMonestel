import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        //Agregar objetos persona a la lista
        Persona objPersona1 = new Persona("Pablo", 37);
        Persona objPersona2 = new Persona("Adriana", 29);
        Persona objPersona3 = new Persona("Helena", 83);

        personas.add(objPersona1); //0
        personas.add(objPersona2); //1
        personas.add(objPersona3); //2


        //Retornar e imprimir el elemento de una posición
        System.out.println(personas.get(1)); //Adriana - 29

        //Retornar el tamaño de un ArrayList
        personas.size(); //3

        //Remover un elemento de una posición específica
        personas.remove(1);

        System.out.println(personas); //Pablo - 37, Helena - 83

        //Verificar si la lista está vacía
        System.out.println("La lista de personas está vacía? " + personas.isEmpty()); //false

        //Verificar si la lista contienea Diego
        System.out.println("La lista de personas contiene al objPersona1? " +personas.contains(objPersona1)); //true

        //Imprimir el ArrayList usando un ciclo for tradicional
        for(int i = 0; i < personas.size(); i++){
            System.out.println("Objeto persona en la posición " + i + " " + personas.get(i));
        }

        //Imprimir el ArrayList usando un for-each
        for (Persona objPersona : personas) {
            System.out.println(objPersona.toString());
        }

        //Vaciar la lista
        personas.clear();
        System.out.println(personas);
    }
}