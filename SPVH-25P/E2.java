
/* 
Escamitas

Los expertos en peces recomiendan
una temperatura tibia entre 21 y 29 grados (el agua está fría a menor temperatura y caliente
a mayor temperatura), pero los peces podrán sobrevivir incluso a temperaturas no menores
que 15 grados y no mayores que 34 grados.

*/
    
package paquete.e2;
import java.util.Scanner; 

public class E2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        if(t<21 && t>15){
            System.out.println("fria!");
        }
        else if(t<=15){
            System.out.println("fria!\nRIP escamitas :(");
        }
        else if(t>=21 && t<=29){
            System.out.println("tibia");
        }
        else if(t>29 && t<=34){
            System.out.println("caliente!");
        }
        else if(t>34){
            System.out.println("caliente!\nRIP escamitas :(");
        }
    }    
}
