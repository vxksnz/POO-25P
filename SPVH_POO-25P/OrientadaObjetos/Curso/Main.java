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
        Profesor profesor = new Profesor("1234567","Uriel Martinez" );
        Curso curso = new Curso("CEL01","10:00-13:00","114231","Laboratorio de Diseño Logico",profesor);
        
        Alumno alumno1 = new Alumno("2245687","Juanito Perez");
        Alumno alumno2 = new Alumno("224545456","Ariana Muñoz");
        Alumno alumno3 = new Alumno("224578","Mario Molina");
        Alumno alumno4 = new Alumno("224787","Juanito Alcachofa");
        Alumno alumno5 = new Alumno("224766397","Eva Rodriguez");
        
        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);
        curso.agregarAlumno(alumno3);
        curso.agregarAlumno(alumno4);
        curso.agregarAlumno(alumno5);
        
        System.out.println(curso);
    }
    
}
