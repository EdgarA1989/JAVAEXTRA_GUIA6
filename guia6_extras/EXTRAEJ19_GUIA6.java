/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ19_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int num1 = leer.nextInt();
        String cadena="";
        int[] vector1 = new int[num1];
        int[] vector2 = new int[num1];
        System.out.println("Ingrese los valores del vector 1");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = leer.nextInt();

        }
        System.out.println("Ingrese los valores del vector 2");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = leer.nextInt();

            if (vector1[i] != vector2[i]) {
                cadena="Los vectores son distintos";
                break;
            }else{
                cadena="Los vectores son iguales";
            }
        }
        System.out.println(cadena);
    }

}
