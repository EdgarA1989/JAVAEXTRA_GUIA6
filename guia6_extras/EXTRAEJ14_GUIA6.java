/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ14_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int num = leer.nextInt();
        int [] vectorf = new int [num];
        int suma=0;
        int f=0;
        for (int i = 0; i < vectorf.length ; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia:" +(i+1));
            int hijos = leer.nextInt();
            int [] vectorh = new int [hijos];
            for (int j = 0; j < vectorh.length ; j++) {
                System.out.println("Ingrese la edad del hijo numero"+(j+1));
                int edad = leer.nextInt();
                suma=suma+edad;
                f++;
            }
        }
                
        double promedio= suma/f;
        System.out.println("El promedio de edad de los hijos de las familias es: "+ promedio);
    }
    
}
