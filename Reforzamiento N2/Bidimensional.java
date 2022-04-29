import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);


        int valor=0;
        int valorDos=0;

        System.out.println("ingrese el espacio de sus filas: ");
        valor = numero.nextInt();
        System.out.println("ingrese el espacio de sus columnas: ");
        valorDos = numero.nextInt();


        int[][] num = new int[valor][valorDos];
        
        System.out.println("Ingrese los numeros.");
        for (int i = 0; i < num.length; i++) {// Dimensión Uno.
            for (int j = 0; j < num.length; j++) {// Dimensión Dos.
                num[i][j] = numero.nextInt();
            }
        }

        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("\nSuma Fila.");
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                suma += num[i][j];
            }
            System.out.println("Fila " + i + " =" + suma);
            suma = 0;
        }

        System.out.println();
        System.out.println("\nSuma Columna");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                suma += num[j][i];
            }
            System.out.println("Columna " + i + " =" + suma);
            suma = 0;
        }
        System.out.println();
    }
}