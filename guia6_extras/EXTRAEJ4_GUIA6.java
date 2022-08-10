/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EXTRAEJ4_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un valor entre 1 y 10");
       Scanner leer = new Scanner(System.in);
       int num1 = leer.nextInt();
       switch (num1) {
           case 1:
               System.out.println("I");
               break;
            case 2:
               System.out.println("II");
               break;
            case 3:
               System.out.println("III");
               break;
            case 4:
               System.out.println("IV");
               break;
            case 5:
               System.out.println("V");
               break;
            case 6:
               System.out.println("VI");
               break;
            case 7:
               System.out.println("VII");
               break;
            case 8:
               System.out.println("VIII");
               break;
            case 9:
               System.out.println("IX");
               break;
            case 10:
               System.out.println("X");
               break;
            default:
                System.out.println("Ingreso una opcion incorrecta");
       }
    }
    
}
