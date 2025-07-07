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
public class Profesor {
    private String numeroEconomico;
    private String nombre;

    public Profesor() {
    }

    public Profesor(String numeroEconomico, String nombre) {
        this.numeroEconomico = numeroEconomico;
        this.nombre = nombre;
    }

    public String getNumeroEconomico() {
        return numeroEconomico;
    }

    public void setNumeroEconomico(String numeroEconomico) {
        this.numeroEconomico = numeroEconomico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "numeroEconomico=" + numeroEconomico + ", nombre=" + nombre;
    }
    
    
}
