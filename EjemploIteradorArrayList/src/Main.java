import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static ArrayList<String> listaPersonas = new ArrayList<String>();

    public static void main(String[] args) {
        listaPersonas.add("Pablo");//0
        listaPersonas.add("Mariana");//1
        listaPersonas.add("Gustavo");//2
        listaPersonas.add("Adriana");//3

        ListIterator<String> iterator = listaPersonas.listIterator();

        while(iterator.hasNext()){
            String persona = iterator.next();

            if(persona.equalsIgnoreCase("GuSTAvo")){
                iterator.set("Rolando");
            }
        }

        System.out.println(listaPersonas.get(2));//Rolando
    }
}