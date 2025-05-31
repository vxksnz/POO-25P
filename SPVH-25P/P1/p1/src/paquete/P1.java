package paquete;
import java.util.Scanner; 

public class P1 {
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
