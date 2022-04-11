import java.util.Scanner;

public class arreglosdibimensionales {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
 
		Scanner entrada = new Scanner(System.in);
		float sumaFila = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Ingrese el número en la fila " + (i)
						+ " columna " + j + " :");
				matriz[i][j] = entrada.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFila += matriz[i][j];
				System.out.print(String.format(" %d ", matriz[i][j]));
			}
			System.out.print(String.format(
					" Suma fila: %f, promedio fila: %f ", sumaFila, sumaFila
							/ matriz.length));
			System.out.println();
		}
    }
}
