// Clase concreta Rectangulo que extiende FiguraGeometrica e implementa Rotable y Escalable
public class Rectangulo extends FiguraGeometrica implements Rotable, Escalable {
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(String color, double grosorBorde, double ancho, double alto) {
        super(color, grosorBorde);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación de los métodos abstractos de FiguraGeometrica
    
    public double calcularArea() {
        return ancho * alto;
    }

    
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    // Implementación del método de Rotable
    
    public void rotar(double grados) {
        System.out.println("Rotando el rectángulo " + grados + " grados.");
    }

    // Implementación del método de Escalable
    
    public void escalar(double factor) {
        ancho *= factor;
        alto *= factor;
        System.out.println("Escalando el rectángulo en un factor de " + factor + ".");
    }

    // Métodos adicionales para obtener el ancho y el alto
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}

