/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class EXTRAEJ3_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra= leer.nextLine();
        switch (letra) {
            case ("A"):
                System.out.println("Es una vocal");
                break;
            case "E":
                System.out.println("Es una vocal"); 
                break;
            case "I":
                System.out.println("Es una vocal");
                break;
            case "O":
                System.out.println("Es una vocal");
                break;
            case "U":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }
    }
    
}

