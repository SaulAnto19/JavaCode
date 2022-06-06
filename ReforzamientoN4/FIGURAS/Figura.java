public abstract class Figura {
    protected int coordenada_x, coordenada_y, ancho, alto;
    protected double perimetro, area;

    Figura(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public abstract double area();

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_x) {
        this.coordenada_y = coordenada_y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
