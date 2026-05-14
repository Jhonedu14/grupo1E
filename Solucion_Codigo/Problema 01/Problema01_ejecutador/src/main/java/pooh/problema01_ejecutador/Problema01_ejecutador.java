/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pooh.problema01_ejecutador;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class Problema01_ejecutador {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        Producto p1 = new Producto("Lenovo", 1200, 3);
        
        CarritoDeCompras carrito = new CarritoDeCompras();

        
        System.out.println("--- Producto Disponible ---");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: $" + p1.getPrecioProducto());
        System.out.println("Stock: " + p1.getCantidad());

   
        System.out.println("\nIngrese cantidad a comprar: ");
        int cantidad = sc.nextInt();

    
        String Compra = carrito.agregarProducto(p1, cantidad);
        System.out.println(Compra);

        
        
       /*equal aqui nos sirve como un == si es que hubo stock va 
        y es igual a producto  agregado correctamente va directamente 
        a imprimir el monto y todo y lo retorna por poner 
        Compra == productor puede saltarnos un error
        
        */
        if (Compra.equals("Producto agregado correctamente")){ 

            double total = carrito.calcularTotal();

            System.out.println("\n--- Detalle de La Compra ---");
            System.out.println(carrito.mostrarDetalleCompra());
            System.out.println("Total a pagar: $" + total);

          
            System.out.println("\nIngrese monto a pagar: ");
            double pago = sc.nextDouble();

            String resultado = carrito.realizarPago(pago, 0.10);
            System.out.println(resultado);

            
            System.out.println("\n--- Stock Actualizado ---");
            System.out.println("Stock restante: " + p1.getCantidad());
        }
    }
    }


   
    

    

