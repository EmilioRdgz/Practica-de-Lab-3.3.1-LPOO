// Clase abstracta FiguraGeometrica
public abstract class FiguraGeometrica {
    protected String color;
    protected double grosorBorde;

    // Constructor
    public FiguraGeometrica(String color, double grosorBorde) {
        this.color = color;
        this.grosorBorde = grosorBorde;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // Métodos concretos comunes a todas las figuras
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(double grosorBorde) {
        this.grosorBorde = grosorBorde;
    }
}
