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
public class Producto {
    private String descripcion;
    private double costo;
    
    Producto(){
        
    }
    
    Producto(String descripcion, double costo){
        this.descripcion = descripcion;
        this.costo = costo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "\nProducto -> " + descripcion + ", costo $" + costo;
    }
    
    
    
    
}
