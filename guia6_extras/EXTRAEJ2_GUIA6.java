/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia6_extras;

/**
 *
 * @author edgar
 */
public class EXTRAEJ2_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        int aux=0;
        
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
    
}
