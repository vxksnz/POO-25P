/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;
import java.util.Scanner; 

/**
 *
 * @author Alumno 25
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
 
      Scanner scan = new Scanner(System.in); 
 
    int a = scan.nextInt(); 
    int b = scan.nextInt(); 
    int c = 1; 
 
 
 
    for(int i=1;i<=(b); ++i){ 
 
        c = c*a; 
    } 
 
      System.out.println(c); 
   } 
    
}
