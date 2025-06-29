package paquete1;

/**
 *
 * @author Alumno24
 */
public class Calculadora {
    
    private double num1;
    private double num2;
    
    //Constructores, getters y setters
    
    public Calculadora(){
        this.num1=0;
        this.num2=0;
    }
    public Calculadora(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void setNum1(double num1){
        this.num1=num1;
    }
    public void setNum2(double num2){
        this.num2=num2;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    
    //Funciones con REALES
    
    public double sumar(){
        return num1+num2;
    }
    public double restar(){
        return num1-num2;
    }
    public double dividir(){
        return num1/num2;
    }
    public double multiplicar(){
        return num1*num2;
    }
    
    //Funciones con ENTEROS
    
    public boolean esPar(int n){
        if (n%2==0) return true;
        else return false;
    }
    public int pow(int a, int b){
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            int t = pow(a, b / 2);
            return t * t;
        } else if (b % 2 == 1) {
            int t = pow(a, b / 2);
            return t * t * a;
        }
        return 1;
    }
    
    public int contarDigitos(int n){
        return String.valueOf(Math.abs(n)).length();
    }

}
