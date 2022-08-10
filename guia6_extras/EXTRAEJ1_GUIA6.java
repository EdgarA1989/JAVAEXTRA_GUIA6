/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EXTRAEJ1_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        int horas=0;
        int dias=minutos/1440;
        if (minutos>1440) {
           horas=(minutos-(dias*1440))/60;   
        
        }else {
          horas=(minutos/60);      
               }
        System.out.println("Son "+dias+ " dias y "+horas+" horas");
        
    }
    
}
