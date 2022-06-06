public class principal {
    public static void main(String[] args) {
        Figura redonda = new Circulo(10,10);
        Rectangulo rectan = new Rectangulo(20,20);
        Figura bola = (Figura) new Rectangulo(2,2);

        System.out.println();
        System.out.println("Area redonda de " + redonda.getAncho() + "x" + redonda.getAlto() + " = " + redonda.area());
        System.out.println("Area pequeña de " + rectan.getAncho() + "x" + rectan.getAlto() + " = " + rectan.area());
        System.out.println("Area bola de " + bola.getAncho() + "x" + bola.getAlto() + " = " + bola.area());
        System.out.println();
    }
}
