package paquete.e2;
import java.util.Scanner; 

public class E2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        String res = "";
        int t = scan.nextInt();
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
