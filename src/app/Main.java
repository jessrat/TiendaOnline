
package app;

import modelo.*;

public class Main {
    public static void main(String[] args) {

        try {
            // Crear cliente
            Cliente cliente = new Cliente("Jorge");

            // Crear productos
            Producto p1 = new Producto("Laptop", 800000);
            Producto p2 = new Producto("Mouse", 15000); // corregido

            // Agregar productos al carrito
            cliente.getCarrito().agregarProducto(p1);
            cliente.getCarrito().agregarProducto(p2);

            // Validar carrito
            if (cliente.getCarrito().estaVacio()) {
                throw new Exception("El carrito está vacío");
            }

            // Mostrar total
            System.out.println("Total compra: " + cliente.getCarrito().calcularTotal());

            // NUEVO: Crear pedido con envío
            Pedido pedido = new Pedido(cliente.getCarrito(), "Av. Siempre Viva 123");

            // Procesar pedido
            pedido.procesarPedido();

            // Confirmar entrega
            pedido.confirmarEntrega();

        } catch (Exception e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }
}