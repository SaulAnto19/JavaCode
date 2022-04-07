public class OpeAritySignos {
    public static void main(String[] args) {
        int v1 = 4;
        int v2 = 4;
        int resultado = 0;

        resultado = v1 + v2 / 2;
        System.out.println("EL RESULTADO incorrecto:" + resultado);

        resultado = (v1 + v2) / 2;
        System.out.println("EL RESULTADO correcto:" + resultado);
    }
}
