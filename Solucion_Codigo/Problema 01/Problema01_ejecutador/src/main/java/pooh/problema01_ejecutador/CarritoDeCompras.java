/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooh.problema01_ejecutador;

/**
 *
 * @author LOQ
 */
public class CarritoDeCompras{
 private Producto producto;
    private int cantidadDeCompra;
    private double total;

    public CarritoDeCompras() {
        producto = null;
        cantidadDeCompra = 0;
        total = 0;
    }

    public String agregarProducto(Producto p, int cantidad) {
        if (p != null) {
            if (cantidad <= p.getCantidad()) {
                producto = p;
                cantidadDeCompra = cantidad;
                return "Producto agregado correctamente";
            } else {
                return "No hay suficiente stock";
            }
        } else {
            return "El producto no existe";
        }
    }

    public double calcularTotal() {
        if (producto != null) {
            total = producto.getPrecioProducto() * cantidadDeCompra;
        }
        return total;
    }

    public String realizarPago(double montoPagado, double descuento) {
        double totalFinal = total;

        if (montoPagado > 1000) {
            totalFinal = total - (total * descuento);
        }

        if (montoPagado >= totalFinal) {
            int nuevoStock = producto.getCantidad() - cantidadDeCompra;
            producto.setCantidad(nuevoStock);

            return "Pago exitoso. Gracias por su compra.";
        } else {
            double faltante = totalFinal - montoPagado;
            return "Pago insuficiente. Faltan $" + faltante;
        }
    }

    public String mostrarDetalleCompra() {
        if (producto != null) {
            return "Producto: " + producto.getNombre() +"\n"
                    + "|Cantidad: " + cantidadDeCompra+"\n"
                    + "|Total: $" + total;
        } else {
            return "No hay productos en el carrito";
        }
    }
}
