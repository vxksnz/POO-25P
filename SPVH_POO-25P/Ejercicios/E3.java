import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n,k;
        
        n = scan.nextInt();
        int[] num = new int[100];
        for(int i=0; i<n;i++){
            num[i]= scan.nextInt();
        }
        k = scan.nextInt();
       for(int i=0; i<n;i++){
           if((num[i]%k) != 0){
                System.out.print("X");
           }else{
               System.out.print(num[i]);
           }
            System.out.print(" ");
        } 
    }  
}
