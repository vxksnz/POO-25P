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
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        String res = "";
        int t = scan.nextInt();
        // 29 a 34 caliente
        // >34 caliente y muerte
        if(t<21 && t>=15){
               System.out.println("fria!");
        }
        else if(t<21 && t<15){
                System.out.println("fria!\nRIP escamitas :(");
        }
        else if(t>21 && t<29){
               System.out.println("tibia");
        }
        else if(t>29 && t<34){
                System.out.println("caliente!");
        }
        else if(t>34){
            System.out.println("caliente!\nRIP escamitas :(");
        }
    }
    
}
