/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia6_extras;

/**
 *
 * @author EANDRADA
 */
public class EXTRAEJ20_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        llenar(vector1);

    }

    public static int[] llenar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);

        }
        imprimir(a);
        return null;
    }

    public static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == (a.length-1)) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + "-");
            }

        }
    }

}
