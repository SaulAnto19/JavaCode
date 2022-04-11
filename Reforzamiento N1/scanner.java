import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numUno = 0;
        double numDos = 0;
        float numTres = 0;
        Double resultado;

        /* Ingreso de datos en string*/
        System.out.println("Cual es su nombre:");
        nombre = in.nextLine();

        /*Ingreso de datos en int */

        System.out.println("Ingrese valor en integer:");
        numUno = in.nextInt();

        /*Ingreso de datos en double*/

        System.out.println("Ingrese valor en double:");
        numDos = in.nextDouble();

        /*Ingreso de datos en float*/

        System.out.println("Ingrese valor en float:");
        numTres = in.nextFloat();

        resultado = numUno + numDos + numTres;

        System.out.println("" + nombre + "el resultado de tu operacion es de: " + resultado);
    }
}
