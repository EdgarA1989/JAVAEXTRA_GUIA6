/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ10_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1 = (int) (Math.random()*10);
       int num2= (int) (Math.random()*10);
        System.out.println(num1*num2);
        System.out.println("Ingrese el valor de la multiplicación");
        int rpta= leer.nextInt();
       while (rpta!=(num1*num2)) {
           System.out.println("Resupesta incorreta vula a ingresar un numero");
           rpta= leer.nextInt();
       }
        System.out.println("Felicidades tu respuesta es correcta");
    }
    
}
