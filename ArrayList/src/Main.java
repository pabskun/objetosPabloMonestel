import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<>();

        //Agregar personas a la lista
        personas.add("Pablo"); //0
        personas.add("Adriana"); //1
        personas.add("Diego"); //2
        personas.add("Helena"); //3

        //Retornar e imprimir el elemento de una posición
        System.out.println(personas.get(1)); //Adriana

        //Retornar el tamaño de un ArrayList
        personas.size(); //4

        //Remover un elemento de una posición específica
        personas.remove(1);

        System.out.println(personas); //Pablo, Diego, Helena

        //Verificar si la lista está vacía
        System.out.println(personas.isEmpty()); //false

        //Verificar si la lista contienea Diego
        System.out.println(personas.contains("Diego")); //true

        //Imprimir el ArrayList usando un ciclo for tradicional
        for(int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i));
        }

        //Imprimir el ArrayList usando un for-each
        for (String nombrePersona : personas) {
            System.out.println(nombrePersona);
        }

        //Vaciar la lista
        personas.clear();
        System.out.println(personas);
    }
}