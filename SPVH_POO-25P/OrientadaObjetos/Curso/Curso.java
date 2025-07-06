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
public class Curso {
    private String id;
    private String trimestre;

    public Curso() {
    }

    public Curso(String id, String trimestre) {
        this.id = id;
        this.trimestre = trimestre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", trimestre=" + trimestre + '}';
    }
    
    
}
