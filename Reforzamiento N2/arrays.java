
/**
 * Programa java que guarda en un array 10 numeros enteros que se leen por teclado. A continuación se 
 * recorre el array y calcula cuantos numeros son positivos, cuantos negativos y cuantos ceros.
 * 
 * contar el numero de elementos positivos, negativos y ceros de un array de 10 elementos. 
 */

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0;
        int i;

        // leemos los valores por teclado y los guardamos en el array
        System.out.println("numeros de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }

        System.out.println("positivos: " + pos);
        System.out.println("negativos: " + neg);
        System.out.println("ceros: " + cero);
    }
}