/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Alumno25
 */
public class Rectangulo {
    
    private int altura;
    private int base;
    
    public Rectangulo(){
        this.base   = 1;
        this.altura = 1;
    }
    
    public Rectangulo(int altura, int base){
        this.altura=altura;
        this.base=base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public int calcularArea(){
        return this.base * this.altura;
    }
    public int calcularPerimetro(){
        return 2*this.base + 2*this.altura;
    }
    
    @Override
    public String toString() {
        return "Rectangulo[base=" + this.base + ", altura=" + this.altura + "]";
    }
    
    
}


