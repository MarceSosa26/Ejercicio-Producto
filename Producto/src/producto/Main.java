/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author Usuario
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        // Crear una instancia de Producto
        Producto producto = new Producto("Laptop", 1200.50, 10);

        // Mostrar valores iniciales
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());

        // Modificar valores
        producto.setPrecio(1000.75);
        producto.setCantidad(15);

        // Mostrar nuevos valores
        System.out.println("Nuevo Precio: " + producto.getPrecio());
        System.out.println("Nueva Cantidad: " + producto.getCantidad());

        // Intentar establecer un precio y cantidad negativos
        producto.setPrecio(-200);
        producto.setCantidad(-5);

        // Mostrar valores después de intentar establecer valores negativos
        System.out.println("Precio después del intento de establecer valor negativo: " + producto.getPrecio());
        System.out.println("Cantidad después del intento de establecer valor negativo: " + producto.getCantidad());
    }
}
    

