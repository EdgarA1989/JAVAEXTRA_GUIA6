/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso
 */
package guia6_extras;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ21_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] pruebas = new String[4];

        for (int i = 0; i < pruebas.length; i++) {
            switch (i) {
                case 0:
                    pruebas[i] = "Primer trabajo Practico";
                    break;
                case 1:
                    pruebas[i] = "Segundo trabajo Practico";
                    break;
                case 2:
                    pruebas[i] = "Primer Integrador";
                    break;
                case 3:
                    pruebas[i] = "Segundo Integrador";
                    break;
            }

        }
        llenar(pruebas);
    }

    public static void llenar(String[] a) {
        Scanner leer = new Scanner(System.in);
        int[] notas = new int[4];
        double suma;
        int bien=0;
        int mal=0;
        
              
            for (int i = 0; i < 10; i++) {
                System.out.println("alumno:" + (i+1));
                suma=0;
                for (int j = 0; j < notas.length; j++) {

                    System.out.println("Ingrese la nota del del " + a[j]);

                    notas[j] = leer.nextInt();
                    switch (j) {
                        case 0:
                            suma = suma + (notas[j] * 0.1);
                            break;
                        case 1:
                            suma = suma + (notas[j] * 0.15);
                            break;
                        case 2:
                            suma = suma + (notas[j] * 0.25);
                            break;
                        case 3:
                            suma = suma + (notas[j] * 0.5);
                            break;
                    }
                         
                }
                 if (suma >= 7) {
                bien++;
                } else {
                mal++;
                }
            }
            
       
        System.out.println("Los alumnos aprobados son: "+bien);
        System.out.println("Los alumnos desaprobados son: "+mal);
    }
   
}
