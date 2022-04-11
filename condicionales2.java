public class condicionales2 {
    public static void main(String[] args) {
        int temperatura = 0;
        boolean haceSol = false;
        int hacesol2 = 37;
        int nevando = 10;
        
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        }
                
        // Si haceSol es vedadero  
        if (haceSol) {
            System.out.println("No te olvides la sombrilla");
        }
                
        // Si esta nevando o hace sol
        if (nevando || hacesol2) {
            System.out.println("Que bien");
        }
                
        // Si nevando y la temperatura esta entre 20 y 30
        if (nevando && (temperatura >= 20 && temperatura <= 30)) {
            System.out.println("No me lo creo");
        }
                
        // Si la temperatura es menor que 0 o mayor que 30 y hace sol
        if ((temperatura < 0 || temperatura > 30) && haceSol) {
            System.out.println("Mejor me quedo en casa");
        }
    }
}
