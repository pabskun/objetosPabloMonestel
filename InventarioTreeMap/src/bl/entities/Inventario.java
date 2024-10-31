package bl.entities;

import java.util.TreeMap;

public class Inventario {
    private String codigo;
    private String nombre;
    private TreeMap<Producto, Integer> productos;

    public Inventario(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.productos = new TreeMap<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(TreeMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        this.productos.put(producto, cantidad);
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
