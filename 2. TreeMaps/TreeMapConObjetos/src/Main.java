import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Definición del TreeMap la clave se define Integer y el valor Provincia
        TreeMap<Integer, Provincia> provinciasMap = new TreeMap<>();

        //Creación de los objetos provincias
        Provincia objProvincia1 = new Provincia(1, "San José");
        Provincia objProvincia2 = new Provincia(2, "Cartago");
        Provincia objProvincia3 = new Provincia(3, "Heredia");
        Provincia objProvincia4 = new Provincia(4, "Alajuela");

        //Asociar los objetos a un TreeMap
        provinciasMap.put(objProvincia1.getCodigo(), objProvincia1);
        provinciasMap.put(objProvincia2.getCodigo(), objProvincia2);
        provinciasMap.put(objProvincia3.getCodigo(), objProvincia3);
        provinciasMap.put(objProvincia4.getCodigo(), objProvincia4);

        //Imprimir el tamaño del Map
        System.out.println("El tamaño del Map es de : " + provinciasMap.size());

        //Imprimir el valor de una llave
        System.out.println(provinciasMap.get(3)); //Objeto que representa a Heredia

        //Verificar si una llave existe
        System.out.println(provinciasMap.containsKey(333)); //false

        //Verificar si un valor existe
        System.out.println(provinciasMap.containsValue("Alajuela")); //false

        //Retorna todas las llaves
        System.out.println(provinciasMap.keySet());

        //Retorna todos los valores
        System.out.println(provinciasMap.values());

        //Imprimir el Map usando un ciclo
        System.out.println("--Imprimiendo todos los valores del Map--");
        provinciasMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            System.out.println("-------");
        });

        //Otra forma de imprimir un TreeMap de objetos
        System.out.println("--Imprimiendo todos los valores del Map--");
        provinciasMap.forEach((key, value) -> {
            System.out.println(value.getCodigo());
            System.out.println(value.getNombre());
            System.out.println("-------");
        });
    }
}