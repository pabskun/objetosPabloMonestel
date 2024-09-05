import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static TreeMap<String, Double> listaProductos = new TreeMap<String, Double>();

    public static void main(String[] args) {
        listaProductos.put("Jabón", 2500.0);
        listaProductos.put("Pan", 1500.5);
        listaProductos.put("Queso", 3500.0);
        listaProductos.put("Tronaditas", 700.0);

        System.out.println(listaProductos.get("Pan"));

        listaProductos.forEach((key,value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("********* Llaves del TreeMap *********");

        System.out.println(listaProductos.keySet());

        System.out.println("********* Valores del TreeMap *********");

        System.out.println(listaProductos.values());

        //Averiguar el producto que tiene mayor costo, recorriendo el TreeMap con un ForEach. --> Queso

        double mayorPrecio = 0.0;
        String productoMasCaro = "";

        for(Map.Entry<String,Double> producto : listaProductos.entrySet()){
            String key = producto.getKey();
            Double value = producto.getValue();

            if(value > mayorPrecio){
                mayorPrecio = value;
                productoMasCaro = key;
            }
        }

        System.out.println(productoMasCaro);


        // Encontrar el producto que tiene mayor costo usando AtomicReference

        AtomicReference<Double> atomicMayorPrecio = new AtomicReference<>(0.0);
        AtomicReference<String> atomicProductoMasCaro = new AtomicReference<>("");

        listaProductos.forEach((key, value) -> {
            if (value > atomicMayorPrecio.get()) {
                atomicMayorPrecio.set(value);
                atomicProductoMasCaro.set(key);
            }
        });

        System.out.println(atomicProductoMasCaro.get());
    }
}