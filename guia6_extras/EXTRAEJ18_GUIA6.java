/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ18_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num1 = leer.nextInt();
        int suma = 0;
        int[] vector1 = new int[num1];

        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = leer.nextInt();
            suma = suma + vector1[i];
        }
        System.out.println("La suma de todos los valores es: " + suma);
    }

}
