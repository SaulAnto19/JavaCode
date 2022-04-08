import java.util.Scanner;

public class ArregloString {
    public static void main(String[] args) {
        int t;
        String nombre;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el espacio de su arreglo: ");
        t = sc.nextInt();

        String[] n = new String[t];

        /** segundo for para imprimir mi arreglo aleatorio */
        System.out.println ("El número de elementos en el array mis Nombres es de " + n.length );
        for (int i = 1; i < n.length; i++) {
            System.out.print("Ingrese el "+ i + " nombre:" + n[i]);
            nombre = sc.nextLine();
        }
        

        /** segundo for para imprimir mi arreglo aleatorio */
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "  ");
        }
    }
}
