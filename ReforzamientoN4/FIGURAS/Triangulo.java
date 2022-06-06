public class Triangulo extends Figura {
    Triangulo(int a, int b) {
        super(a, b);
    }

    @Override
    public double area() {
        area = ancho * alto / 2;
        return area;
    }
}