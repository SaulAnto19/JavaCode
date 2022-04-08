import java.util.Scanner;

public class switchcaseScanner {
    public static void main(String[] args) {
        int num_uno = 0, num_dos = 0, resultado = 0;
        int parametro = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el numero uno: ");
        num_uno = in.nextInt();
        System.out.print("Ingrese el numero dos: ");
        num_dos = in.nextInt();

        System.out.println("-------------------------");
        System.out.println("Ingrese la opcion a usar:");
        parametro = in.nextInt();

        switch (parametro) {

            case 1:
                resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case 2:
                resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case 3:
                resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;

            case 4:
                resultado = num_uno / num_dos;
                System.out.println("El resultado de la división es: " + resultado);
                break;

            default:
                System.out.println("Error, la opción no existe");
                break;
        }
    }
}
