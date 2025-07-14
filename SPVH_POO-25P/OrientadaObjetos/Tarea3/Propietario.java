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
public class Propietario {
    private String nombre;
    private String rfc;
    
    Propietario(){
    }
    
    Propietario(String nombre, String rfc){
        this.nombre = nombre;
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "Propietario -> " + nombre + ", RFC -> " + rfc ;
    }
    
    
}
