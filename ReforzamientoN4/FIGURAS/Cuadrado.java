public class Cuadrado extends Figura {

    Cuadrado(int lado) {
        super(lado, lado);
    }

    Cuadrado(int lado, int vacio) {
        super(lado, lado);
    }

    @Override
    public double area() {
        area = ancho * alto;
        return area;
    }
}
