/*
Elevando a alguna potencia
Dados dos valores a y b, calcular el valore de a^b.
*/

package paquete.e1;
import java.util.Scanner; 

public class E1 {
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
