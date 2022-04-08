import java.util.Scanner;

public class ArreglosUnidiDinamico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        
        System.out.print("Ingrese el espacio de su arreglo: ");
        t = sc.nextInt();

        int[] n = new int[t];
        
        /** primer for para hacer el recorrido del arreglo */
        for (int i = 0; i < t; i++) {
            n[i] = (int) (Math.random() * 20 + 1);
        }
        
        /** segundo for para imprimir mi arreglo aleatorio */
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "  ");
        }
    }
}
