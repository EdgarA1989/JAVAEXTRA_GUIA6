/*
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package guia6_extras;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ22_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz1= new int [5][5];
        int suma= 0;
        for (int i = 0; i <  matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j]=(int) (Math.random()*99);
                suma = suma + matriz1[i][j];
            }
        }
        
        for (int i = 0; i <  matriz1.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j]=(int) (Math.random()*99);
                suma = suma + matriz1[i][j];
                System.out.print(matriz1[i][j]+"-");
            }
        }
        System.out.println("");
        System.out.println("La suma de los elementos es: "+ suma);
        
    }
    
}
