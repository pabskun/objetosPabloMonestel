import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static ArrayList<String> listaPersonas = new ArrayList<String>();
    public static void main(String[] args) {

        listaPersonas.add("Pablo");//0
        listaPersonas.add("Cristel");//1
        listaPersonas.add("Mónica");//2
        listaPersonas.add("Juan");//3
        listaPersonas.add("Amanda");//4

        recorrerArrayListConCicloTradicional();
        reemplazarPersonaDelArrayList("Juan");

        recorrerArrayListConCicloForEach();
        reemplazarPersonaDelArrayListUsandoIterador("Pablo");

    }
    public static void recorrerArrayListConCicloTradicional(){
        for(int i = 0; i < listaPersonas.size(); i++){
            System.out.println(listaPersonas.get(i));
        }

    }
    public static void reemplazarPersonaDelArrayList(String nombre){
        for(int i = 0; i < listaPersonas.size(); i++){
            if(listaPersonas.get(i).equals(nombre)){
                listaPersonas.set(i, "Pedro");
            }
        }
    }

    public static void recorrerArrayListConCicloForEach(){
        for(String nombre: listaPersonas){
            System.out.println(nombre);
        }
    }

    public static void reemplazarPersonaDelArrayListUsandoIterador(String nombre){
        ListIterator<String> iterator = listaPersonas.listIterator();
        while (iterator.hasNext()) {
            String persona = iterator.next();
            if (persona.equals(nombre)) {
                iterator.set("Mauro"); // Cambiamos el nombre de la persona por "Mauro"
            }
        }
    }
}