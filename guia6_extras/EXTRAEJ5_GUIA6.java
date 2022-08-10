/*
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EXTRAEJ5_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Clase de Socio");
        System.out.println("A-Tipo de Socio A");
        System.out.println("B-Tipo de SOcio B");
        System.out.println("C-Tipo de Socio C");
        String opcion = leer.nextLine();
        double valor = 0;
        switch (opcion) {
            case "A":
            System.out.println("Ingrese el valor del tratamiento");
            int tratamiento = leer.nextInt();
            valor = 0.5*tratamiento;
            System.out.println("El valor del tratamiento es de " + valor);
            break;
            
            case "B":
            System.out.println("Ingrese el valor del tratamiento");
            tratamiento = leer.nextInt();
            valor = 0.35*tratamiento;
            System.out.println("El valor del tratamiento es de " + valor);
            break;
            
            case "C":
            System.out.println("Ingrese el valor del tratamiento");
            tratamiento = leer.nextInt();
            valor= tratamiento;
            System.out.println("El valor del tratamiento es de " + valor);
            break;
             
        }
        
        
    }
    
}
