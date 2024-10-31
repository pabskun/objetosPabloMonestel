package ui;

import bl.entities.Inventario;
import bl.entities.Producto;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario("inv-001", "Abarrotes");
        Producto prod1 = new Producto("001", "Tronaditas", 800);
        Producto prod2 = new Producto("002", "Leche de almendra", 2500);
        Producto prod3 = new Producto("003", "Helado de Menta", 1890);

        inventario.agregarProducto(prod1, 10);
        inventario.agregarProducto(prod2, 5);
        inventario.agregarProducto(prod3, 7);

        System.out.println(inventario);
        //Key: obj Producto, value cantidad
        inventario.getProductos().forEach((key, value)->{
            System.out.println("--- Código: " + key.getCodigo());
            System.out.println("--- Producto: " + key.getNombre());
            System.out.println("--- Cantidad: " + value);

            System.out.println("*****  *****");
        });
    }
}