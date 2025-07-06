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
public class Alumno {
    private String maticula;
    private String nombre;

    public Alumno() {
    }

    public Alumno(String maticula, String nombre) {
        this.maticula = maticula;
        this.nombre = nombre;
    }

    public String getMaticula() {
        return maticula;
    }

    public void setMaticula(String maticula) {
        this.maticula = maticula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "maticula=" + maticula + ", nombre=" + nombre + '}';
    }
    
    
    
}
