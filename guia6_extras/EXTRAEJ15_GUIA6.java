/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ15_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int opcion =0;
        
        
        while (opcion!=5) {
        System.out.println("*****MENU*****");
        System.out.println("1-SUMAR");
        System.out.println("2-RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        System.out.println("5-SALIR");
        opcion= leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: "+SUMAR(num1,num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: "+RESTAR(num1,num2));
                break;
            case 3:
                System.out.println("El resultado de la Multiplicación es: "+ MULTI(num1,num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: "+DIVI(num1,num2));
                break;
                      
        }
        
        
    }
        System.out.println("PROGRAMA FINALIZADO");
    }
    public static int SUMAR(int a,int b){
        int suma= a + b;
        return suma;
    }
     public static int RESTAR(int a,int b){
        int resta= a - b;
        return resta;
    }
      public static int MULTI(int a,int b){
        int multi = a * b;
        return multi;
    }
       public static double DIVI(double a,double b){
        double divi= a / b;
        return divi;
    }
}
