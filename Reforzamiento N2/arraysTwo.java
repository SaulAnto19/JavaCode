import java.util.Scanner;

public class arraysTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[100];
        // int[] temp = new int[100];
        for (int i = 0; i < 100; i++) {
            n[i] = (int) (Math.random() * 20 + 1);
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("Ingrese el primer valor:");
        int valor1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int valor2 = sc.nextInt();

        for (int i = 0; i < n.length; i++) {
            if (n[i] == valor1) {
                n[i] = valor2;
                System.out.print(" '" + n[i] + "'  ");
            } else {
                System.out.print(n[i] + "  ");
            }
        }

    }
}
