
package modelo;

public class Pedido {
    private Carrito carrito;
    private Envio envio;

    public Pedido(Carrito carrito, String direccion) {
        this.carrito = carrito; // relación de agregación
        this.envio = new Envio(direccion, this); // relación deComposición
    }

    public void procesarPedido() {
        try {
            if (carrito.estaVacio()) {
                throw new Exception("El carrito está vacío");
            }

            envio.enviar();

        } catch (Exception e) {
            System.out.println("Error al procesar pedido: " + e.getMessage());
        }
    }

    public void confirmarEntrega() {
        envio.entregar();
    }

    public Envio getEnvio() {
        return envio;
    }
}