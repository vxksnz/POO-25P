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
public class UEA {
    private String materia;
    private String claveUea;

    public UEA() {
    }

    public UEA(String materia, String claveUea) {
        this.materia = materia;
        this.claveUea = claveUea;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getClaveUea() {
        return claveUea;
    }

    public void setClaveUea(String claveUea) {
        this.claveUea = claveUea;
    }

    @Override
    public String toString() {
        return "UEA{" + "materia=" + materia + ", claveUea=" + claveUea + '}';
    }
    
    
}
