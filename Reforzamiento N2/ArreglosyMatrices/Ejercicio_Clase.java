package ArreglosyMatrices;

import java.util.Scanner;

public class Ejercicio_Clase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor=0;
        int valorDos=0;

        System.out.println("ingrese el espacio de sus filas: ");
        valor = in.nextInt();
        System.out.println("ingrese el espacio de sus columnas: ");
        valorDos = in.nextInt();

        int matriz[][] = new int[valor][valorDos];

        System.out.println("Agregando los numeros de mi matrix: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
