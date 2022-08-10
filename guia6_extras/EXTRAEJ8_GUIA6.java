/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ8_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       int a=0;
       int par=0;
       int impar=0;
      while (a==0) {
          System.out.println("Ingrese un numero");
          int num = leer.nextInt();
          if (num%5==0){
              break;
          }
          if (num%2==0){
              par++;
          }else
            impar++;
      }
        System.out.println("son "+par+ " numeros pares");
        System.out.println("son "+impar+ " numeros impares");
      }
      
    }
    

