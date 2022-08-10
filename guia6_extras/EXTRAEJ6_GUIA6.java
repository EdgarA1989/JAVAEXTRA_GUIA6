/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia6_extras;

import java.util.Scanner;


/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ6_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas");
        int personas = leer.nextInt();
        double sum1=0;
        int j =1;
        double sum2=0;
        double estatura;
        
        while (j<= personas) {
           System.out.println("Ingrese la estatura de la persona " + j++);
           estatura=leer.nextDouble();
           if (estatura<1.60) {
               sum1=sum1+estatura;
           }
          sum2=sum2+estatura;
            
        }
       
        double promb= sum1/j;
        double promt= sum2/personas;
        System.out.println("El promedio de de estatura de personas menores a 1,6 mts es: "+ promb);
        System.out.println("El promedio de estatura de todas las personas es: "+ promt);
    }
    
}
