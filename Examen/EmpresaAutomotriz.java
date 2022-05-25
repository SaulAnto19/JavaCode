import java.util.Scanner;

public class EmpresaAutomotriz {
    public static void main(String[] args) {

        // las 5 agencias y las 12 meses del año
        Double[][] autos = new Double[5][5];

        int opc = 0;
        Double sumaFila = (double) 0;
        Double menor = (double) 0;
        Double mayor = (double) 0;
        Scanner en = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println();
            System.out.println("EMPRESA AUTOMOTRIZ");
            System.out.println(
                    "\n\t\t--------------------------\n"
                            + "\t\tDIGITE LA OPCION A ESCOGER:\n\n"
                            + "\t\t(1) registrar datos de los autos\n"
                            + "\t\t(2) Mostrar los ventas vendidas\n"
                            + "\t\t    de cada agencia\n"
                            + "\t\t(3) Mostrar el total de ventas\n"
                            + "\t\t    de la agencia 3\n"
                            + "\t\t(4) Mostrar el promedio de ventas\n"
                            + "\t\t    en el mes de diciembre 3\n"
                            + "\t\t(5) Mostrar el numero de la agencia\n"
                            + "\t\t    que tuvo mayores ventas mes de mayo\n"
                            + "\t\t(6) Mostrar en el mes que registraron\n"
                            + "\t\t    menores ventas del año, considerando\n"
                            + "\t\t    todas las agencias\n"
                            + "\t\t(7) salir\n"
                            + "\t\t--------------------------");
            System.out.print("\t\tOpcion: ");
            opc = en.nextInt();
            System.out.println("");

            switch (opc) {
                // registra y almacenar los datos de las agencias
                case 1: {
                    for (int i = 0; i < autos.length; i++) {
                        for (int j = 0; j < autos[0].length; j++) {
                            System.out.println("Venta de Auto N" + j + " de la Agencia N" + i);
                            autos[i][j] = en.nextDouble();
                        }
                    }
                    break;
                }
                // Mostrar los ventas vendidas de cada agencia
                case 2: {
                    for (int i = 0; i < autos.length; i++) {
                        System.out.println();
                        System.out.print("Agencia N" + i + " ");

                        for (int j = 0; j < autos[0].length; j++) {
                            System.out.print("|" + autos[i][j] + "|");
                        }
                    }
                    break;
                }
                // Mostrar el total de ventas de la agencia 3
                case 3: {
                    Double sumaAgenciaTres = (double) 0;

                    for (int i = 0; i < autos.length; i++) {
                        sumaFila = (double) 0;
                        System.out.println();
                        System.out.print("Agencia N" + i + " ");

                        for (int j = 0; j < autos[0].length; j++) {
                            sumaFila += autos[i][j];
                            sumaAgenciaTres = autos[2][0] + autos[2][1] + autos[2][2] + autos[2][3] + autos[2][4];
                            System.out.print("|" + autos[i][j] + "|");
                        }
                        System.out.print(String.format("TOTAL DE VENTAS: %0,2f", sumaFila));
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("total de ventas de la agencia N2 : " + sumaAgenciaTres);
                    System.out.println();
                    break;
                }
                // Mostrar el promedio de ventas en el mes de diciembre 3
                case 4: {
                    Double promedioDiciembre = (double) 0;

                    for (int i = 0; i < autos.length; i++) {
                        sumaFila = (double) 0;
                        System.out.println();
                        System.out.print("Agencia N" + i + " ");

                        for (int j = 0; j < autos[0].length; j++) {
                            sumaFila += autos[i][j];
                            promedioDiciembre = autos[0][4] + autos[1][4] + autos[2][4] + autos[3][4] + autos[4][4];
                            System.out.print("|" + autos[i][j] + "|");
                        }
                        System.out.print(String.format(" PROMEDIO DE VENTAS: %0,2f",
                                sumaFila / autos.length));
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("promedio de ventas en el mes de diciembre : " + promedioDiciembre / autos.length);
                    System.out.println();
                    break;
                }
                // Mostrar el numero de la agencia que tuvo mayores ventas mes de mayo
                case 5: {
                    mayor = autos[0][0];
                    for (int i = 0; i < autos.length; i++) {
                        for (int j = 0; j < autos[0].length; j++) {
                            if (autos[i][j] > mayor) {
                                mayor = autos[i][j];
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("\t\tla venta mayor de todas las agencias es: " + mayor);
                    System.out.println();
                    break;
                }
                // Mostrar en el mes que registraron menores ventas del año, considerando todas
                // las agencias
                case 6: {
                    menor = autos[0][0];
                    for (int i = 0; i < autos.length; i++) {
                        for (int j = 0; j < autos[0].length; j++) {
                            if (autos[i][j] < menor) {
                                mayor = autos[i][j];
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("\t\tla venta menor de todas las agencias es: " + menor);
                    System.out.println();
                    break;
                }
                // salir
                case 7: {
                    System.out.println("");
                    System.out.println("\t\tMuchas gracias por usar esta aplicacion");
                    System.out.println("\t\tEspero tenga un excelente dia");
                    System.out.println("");
                    break;
                }
                default:
                    System.out.println("");
                    System.out.println("\t\tvuelva a elegir la opcion por favor haha");
                    System.out.println("");
            }// termina el switch

        } while (opc != 7);

    }
}
