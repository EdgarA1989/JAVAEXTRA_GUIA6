/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ16_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        edades();
    }
    
    public static void edades(){
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        System.out.println("Ingrese la cantidad de personas");
        int cantidad = leer.nextInt();
        String [] vector1 = new String [cantidad];
        int [] vector2 = new int [cantidad];
        for (int i = 0; i < cantidad; i++) {
           System.out.println("Ingrese el nombre de la persona "+(i+1));
            vector1[i] = leer.next();
            
            System.out.println("Ingrese la edad de: "+ vector1[i]);
            vector2 [i] = leer.nextInt();
        }
        
            
       
        for (int j = 0; j < cantidad; j++) {
            System.out.println("Nombre:"+vector1[j]);
            System.out.println("Edad:"+vector2[j]);
            if (vector2[j]>=18) {
                System.out.println("Es mayor de Edad");
            }else {
                System.out.println("No es mayor de Edad");
            }
            System.out.println("¿Desea seguir mostrando personas?");
            opcion= leer.next();
            if (opcion.equals("No")){
             break;   
            }
        }
        
    
}
}
