public class Circulo extends Figura {
    Circulo(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    public double area() {
        if (ancho == alto) {
            area = Math.PI * (ancho / 2) * (ancho / 2);
        } else
            area = 0;
        return area;

    }
}
