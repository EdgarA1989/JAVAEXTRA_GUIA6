/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ24_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int largo = leer.nextInt();
        int [] fibo = new int [largo];
        
        for (int i = 0; i < fibo.length; i++) {
            if (i==0 || i==1){
                fibo[i]= 1;
               
                System.out.print(fibo[i]+", ");
            }else {
                fibo[i]=fibo[i-1]+fibo[i-2];
                System.out.print(fibo[i]+", ");
            }
        }
    }
    
}
