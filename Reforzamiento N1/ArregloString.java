import java.util.Scanner;

public class ArregloString {
    public static void main(String[] args) {
        int t;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el espacio de su arreglo: ");
        t = sc.nextInt();

        String[] n = new String[t];

        /** segundo for para imprimir mi arreglo aleatorio */
        System.out.println();
        System.out.println ("El número de elementos a agregar es de: " + n.length);
        System.out.println();

        for (int i = 0; i < n.length; i++) {
            System.out.print("Ingrese el nombre N"+ i + ": ");
            n[i] = sc.next();
        }
        

        /** segundo for para imprimir mi arreglo aleatorio */
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "  ");
        }
    }
}
