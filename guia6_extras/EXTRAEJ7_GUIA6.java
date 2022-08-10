/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ7_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int N = leer.nextInt();
        
        hacer(N);
        mientras(N);
    }
    public static void mientras(int a){
        Scanner leer = new Scanner(System.in);
        int i=0;
        int suma=0;
        int max =0;
        int min=0;
        while (i < a) {
            i++;
            System.out.println("Ingrese el "+i+" numero");
            int num= leer.nextInt();
            suma = suma + num;
            if (i==1){
                max=num;
                min=num;
            }
            if (num > max){
                max=num;
            }
             if (num < min){
                min=num;
            }
        }
        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
        System.out.println("El valor promedio es " + (suma/a));
    }
     public static void hacer(int a){
        Scanner leer = new Scanner(System.in);
        int i=0;
        int suma=0;
        int max =0;
        int min=0;
        do {
            i++;
            System.out.println("Ingrese el "+i+" numero");
            int num= leer.nextInt();
            suma = suma + num;
            if (i==1){
                max=num;
                min=num;
            }
            if (num > max){
                max=num;
            }
             if (num < min){
                min=num;
            }
             } while (i < a); 
        
        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
        System.out.println("El valor promedio es " + (suma/a));
    
     } 
}
