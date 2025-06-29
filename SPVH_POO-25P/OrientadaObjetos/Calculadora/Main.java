/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author vickh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Calculadora calcu1 = new Calculadora();
        int sel;
        System.out.println("-----Calculadora-----");
        System.out.println("---------------------");
        System.out.print("Tipo de numeros a operar? Reales(1);Enteros(2): ");
        sel = scan.nextInt();
        
        if(sel == 1){
            
            System.out.println("Indique dos numeros reales: ");
            
            double num1, num2;
            System.out.print("Numero 1: ");
            num1 = scan.nextDouble();
            System.out.print("Numero 2: ");
            num2 = scan.nextDouble();
            
            calcu1.setNum1(num1);
            calcu1.setNum2(num2);
            
            System.out.print("Operacion a realizar? Suma(1); Resta(2); Division(3); Multiplicar(4): ");
            int sel2 = scan.nextInt();
            switch(sel2){
                case 1:
                    System.out.println("El resultado de la suma es: " + calcu1.sumar());
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + calcu1.restar());
                    break;
                case 3:
                    System.out.println("El resultado de la division es: " + calcu1.dividir());
                    break;
                case 4:
                    System.out.println("El resultado de la multiplicacion es: " + calcu1.multiplicar());
                    break;
                default: 
          
            }  
        }else if(sel==2){
            
            
            System.out.print("Operacion a realizar? EsPar?(1); Potencia(2); Contar Digitos(3): ");
            int sel3 = scan.nextInt();
            switch(sel3){
                case 1:
                    System.out.println("--------- Es Par --------");
                    System.out.print("Indique un numero entero: ");
                    int n = scan.nextInt();
                    if(calcu1.esPar(n))System.out.println("es par");
                    else System.out.println("no es par");
                    break;
                case 2:
                    System.out.println("--------- Potencia --------");
                    System.out.println("Indique dos numeros enteros: ");
                    int a, b;
                    System.out.print("Numero 1: ");
                    a = scan.nextInt();
                    System.out.print("Numero 2: ");
                    b = scan.nextInt();
                    
                    System.out.println("Resultado: " + calcu1.pow(a,b));
                    break;
                case 3:
                    System.out.println("--------- Contar Digitos --------");
                    System.out.print("Indique un numero entero: ");
                    int n2 = scan.nextInt();
                    System.out.println("Numero de digitos: " + calcu1.contarDigitos(n2));
                    break;
                default: 
          
            }
            
        }
        
        
        
    }
    
}
