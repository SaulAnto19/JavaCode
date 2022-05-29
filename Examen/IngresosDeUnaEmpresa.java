import java.util.Scanner;

public class IngresosDeUnaEmpresa {
    public static void main(String[] args) {

        Double[][] ingresos = new Double[1][12];

        int opc = 0;

        Double menor = (double) 0;
        Double mayor = (double) 0;
        Double promedio = (double) 0;

        Scanner en = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println();
            System.out.println("EMPRESA AMPM ");
            System.out.println(
                    "\n\t\t--------------------------\n"
                            + "\t\tDIGITE LA OPCION A ESCOGER:\n\n"
                            + "\t\t(1) registrar ingresos de los meses en el año\n"
                            + "\t\t(2) Visualizar todos los ingresos del año\n"
                            + "\t\t(3) Determinar el mes con los mayores ingresos\n"
                            + "\t\t(4) Determinar el mes con los menores ingresos\n"
                            + "\t\t(5) Determinar el promedio de los ingresos en el año 2019\n"
                            + "\t\t(7) salir\n"
                            + "\t\t--------------------------");
            System.out.print("\t\tOpcion: ");
            opc = en.nextInt();
            System.out.println("");

            switch (opc) {
                // registra y almacenar los datos de los ingresos de la empresa
                case 1: {

                    for (int i = 0; i < ingresos.length; i++) {
                        for (int j = 0; j < ingresos[0].length; j++) {
                            System.out.println("Ingresos del Mes N" + (j + 1));
                            ingresos[i][j] = en.nextDouble();
                        }
                    }

                    break;
                }
                // Muestra los ingresos vendidos por mes
                case 2: {

                    for (int i = 0; i < ingresos.length; i++) {
                        System.out.print("INGRESOS DEL AÑO 2019: ");
                        for (int j = 0; j < ingresos[0].length; j++) {
                            System.out.print("|" + ingresos[i][j] + "|");
                        }
                    }

                    break;
                }
                // Determinar el mes con los mayores ingresos
                case 3: {
                    mayor = ingresos[0][0];

                    for (int i = 0; i < ingresos.length; i++) {
                        for (int j = 0; j < ingresos[0].length; j++) {
                            if (ingresos[i][j] > mayor) {
                                mayor = ingresos[i][j];
                            }
                        }
                    }

                    System.out.println();
                    System.out.println("\t\tEl ingreso mayor de de la empresa es: " + mayor);
                    System.out.println();
                    break;
                }
                // Determinar el mes con los menores ingresos
                case 4: {
                    menor = ingresos[0][0];
                    for (int i = 0; i < ingresos.length; i++) {
                        for (int j = 0; j < ingresos[0].length; j++) {
                            if (ingresos[i][j] < menor) {
                                menor = ingresos[i][j];
                            }
                        }
                    }

                    System.out.println();
                    System.out.println("\t\tEl ingreso menor de de la empresa es: " + menor);
                    System.out.println();

                    break;
                }
                // determinar el promedio de los ingresos
                case 5: {
                    for (int i = 0; i < ingresos.length; i++) {
                        for (int j = 0; j < ingresos[0].length; j++) {
                            promedio += ingresos[i][j];
                        }
                        System.out.print(String.format(" PROMEDIO DE INGRESOS EN EL AÑO ES: %0,2f",
                                promedio / ingresos[0].length));
                        System.out.println();
                    }
                }
                default:
                    System.out.println("");
                    System.out.println("\t\tvuelva a elegir la opcion por favor haha");
                    System.out.println("");
            }
        } while (opc != 7);
    }
}
