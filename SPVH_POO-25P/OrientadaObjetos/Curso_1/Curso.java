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
public class Curso {
    private String grupo;
    private String horario;
    private Uea uea;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;
    
    public Curso(){
        uea = new Uea();
        profesor = new Profesor();
        alumnos = new ArrayList<>();
    }
    public Curso(String grupo, String horario, String clave, String nombreUea, String numEconomico, String nombre){
        this.grupo=grupo;
        this.horario=horario;
        uea = new Uea(clave,nombreUea);
        profesor = new Profesor(numEconomico,nombre);
        alumnos = new ArrayList<>();
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    } 
    
    public Uea getUea() {
        return uea;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
    public void setUea(String nombreUea, String claveUea) {
        uea.setClaveUea(claveUea);
        uea.setNombreUea(nombreUea);
    }

    public void setProfesor(String numeroEconomico, String nombre) {
        profesor.setNumeroEconomico(numeroEconomico);
        profesor.setNombre(nombre);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    @Override
    public String toString() {
        return "Curso: \nGrupo: " + grupo + "\nhorario: " + horario + "\nUEA: " + uea + "\nProfesor: " + profesor + "\nAlumnos: \n" + alumnos ;
    }
    
    
    
    
}
