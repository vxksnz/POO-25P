/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package paquete1;
import java.util.ArrayList;
/**
 *
 * @author vickh
 */
public class Tienda {
    private String nombre;
    private Propietario propietario;
    private ArrayList<Producto> productos;
    
    
    Tienda(){
        propietario = new Propietario();
        productos = new ArrayList<>();
    }
    Tienda(String nombre,String nombrePropietario,String rfcPropietario){
        this.nombre = nombre;
        propietario = new Propietario(nombrePropietario,rfcPropietario);
        productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
    
    public void setPropietario(String nombre, String rfc){
        propietario.setNombre(nombre);
        propietario.setRfc(rfc);
    }
    
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    
    public void setProducto(ArrayList<Producto> productos){
        this.productos = productos;
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void mostrarInventario(){
        System.out.println("        Productos  ");
        for(Producto producto: productos){
            System.out.println(producto.getDescripcion());
        }
    }
    public double obtenerTotalVenta(){
        double res = 0;
        
        for(Producto producto:productos){
            res+= producto.getCosto();
        }
        return res;
    }
    public void filtrarProductos(double v){
        for (Producto producto:productos){
            if(producto.getCosto()> v){
                System.out.println(producto);
            }
        }
    }
    public void filtrarProductos(String nombre){
        for (Producto producto:productos){
            if(producto.getDescripcion().equalsIgnoreCase(nombre)) System.out.println(producto);
        }
    }
    public double obtenerGanancias(){
        double gain = 0.2* obtenerTotalVenta();
        return gain; 
    }

    @Override
    public String toString() {
        return "______________________Tienda "+ nombre + " ______________________\n"
                +propietario + "\nINVENTARIO \n" + productos;
    }
    
    
}
