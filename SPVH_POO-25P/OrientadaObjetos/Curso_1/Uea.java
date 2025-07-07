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
public class Uea {
    private String nombreUea;
    private String claveUea;

    public Uea() {
    }

    public Uea(String claveUea , String nombreUea) {
        this.nombreUea = nombreUea;
        this.claveUea = claveUea;
    }

    public String getNombreUea() {
        return nombreUea;
    }

    public void setNombreUea(String nombreUea) {
        this.nombreUea = nombreUea;
    }

    public String getClaveUea() {
        return claveUea;
    }

    public void setClaveUea(String claveUea) {
        this.claveUea = claveUea;
    }

    @Override
    public String toString() {
        return "nombreUea=" + nombreUea + ", claveUea=" + claveUea ;
    }

    
    
}
