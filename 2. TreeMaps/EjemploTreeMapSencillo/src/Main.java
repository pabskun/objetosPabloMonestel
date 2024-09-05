import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Definición del TreeMap la clave se define String y el valor String
        TreeMap<String, String> personas = new TreeMap<>();

        personas.put("111", "Pablo");
        personas.put("222", "Morgana");
        personas.put("333", "Agata");

        //Imprimir el tamaño del Map
        System.out.println("El tamaño del Map es de : " + personas.size());

        //Imprimir el valor de una llave
        System.out.println(personas.get("222")); //Morgana

        //Verificar si una llave existe
        System.out.println(personas.containsKey("333")); //true

        //Verificar si un valor existe
        System.out.println(personas.containsValue("Morgana")); //true

        //Retorna todas las llaves
        System.out.println(personas.keySet());

        //Retorna todos los valores
        System.out.println(personas.values());

        //Imprimir el Map usando un ciclo
        System.out.println("--Imprimiendo todos los valores del Map--");
        personas.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            System.out.println("-------");
        });
    }
}