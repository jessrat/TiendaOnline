package modelo;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) throws Exception {
        if (precio <= 0) {
            throw new Exception("El precio no puede ser cero o negativo");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
