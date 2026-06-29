
package modelo;

public class Envio {
    private String direccion;
    private String estado; // Pendiente, Enviado, Entregado
    private Pedido pedido;

    public Envio(String direccion, Pedido pedido) {
        this.direccion = direccion;
        this.pedido = pedido;
        this.estado = "Pendiente";
    }

    public void enviar() throws Exception {
        if (direccion == null || direccion.isEmpty()) {
            throw new Exception("Dirección inválida");
        }

        estado = "Enviado";
        System.out.println("Pedido enviado a: " + direccion);
    }

    public void entregar() {
        estado = "Entregado";
        System.out.println("Pedido entregado");
    }

    public String getEstado() {
        return estado;
    }
}