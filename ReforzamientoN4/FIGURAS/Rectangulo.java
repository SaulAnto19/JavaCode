public class Rectangulo extends Figura {

    Rectangulo(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    public double area() {
        area = ancho * alto;
        return area;
    }
}
