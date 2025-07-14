/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author vickh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda unaTienda = new Tienda("Uameros","Leticia Mejia Mora","MEML680211GG8");
        
        Producto p1 = new Producto("Refresco de manzana",30);
        Producto p2 = new Producto("Agua Mineral",40);
        Producto p3 = new Producto("Pan de Caja",50);
        Producto p4 = new Producto("Cereal de Arroz inflado",80);
        Producto p5 = new Producto("caja de aceite vegetal",600);
        
        unaTienda.agregarProducto(p1);
        unaTienda.agregarProducto(p2);
        unaTienda.agregarProducto(p3);
        unaTienda.agregarProducto(p4);
        unaTienda.agregarProducto(p5);
        
        unaTienda.mostrarInventario();

        System.out.println(unaTienda);

        System.out.println("Total: "+unaTienda. obtenerTotalVenta());

        unaTienda.filtrarProductos(75.50);
 
        unaTienda.filtrarProductos("pan de CAJA");


        
        // segundos objetos
        
        Tienda otraTienda = new Tienda("El castor","Victor Hugo Sanchez", "SAPV06110778A");
        
        Producto p6 = new Producto("Boing de Mango",25.6);
        Producto p7 = new Producto("Agua Mineral",25);
        Producto p8 = new Producto("Nito Bimbo",15);
        Producto p9 = new Producto("Corn Flakes",23);
        Producto p10 = new Producto("Caja de malboro de Sandia",80);
        
        otraTienda.agregarProducto(p6);
        otraTienda.agregarProducto(p7);
        otraTienda.agregarProducto(p8);
        otraTienda.agregarProducto(p9);
        otraTienda.agregarProducto(p10);
        
        otraTienda.mostrarInventario();

        System.out.println(otraTienda);

        System.out.println("Total: "+otraTienda.obtenerTotalVenta());

        otraTienda.filtrarProductos(75.50);
 
        otraTienda.filtrarProductos("coRn FlAkeS");
 
    }
    
}
