import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        String usuario = "", password = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        password = entrada.nextLine();

        if (usuario.equals("saul") && password.equals("1234")) {
            System.out.println("Inicio de sesión correcto");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos");
        }
    }
}
