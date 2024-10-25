// Clase de prueba Main
public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo
        Rectangulo rectangulo = new Rectangulo("Azul", 1.5, 4.0, 5.0);

        // Mostrar sus propiedades
        System.out.println("Color: " + rectangulo.getColor());
        System.out.println("Grosor del borde: " + rectangulo.getGrosorBorde());
        System.out.println("Ancho: " + rectangulo.getAncho());
        System.out.println("Alto: " + rectangulo.getAlto());

        // Calcular y mostrar área y perímetro
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        // Rotar y escalar el rectángulo
        rectangulo.rotar(45);
        rectangulo.escalar(1.5);

        // Mostrar nuevas dimensiones tras el escalado
        System.out.println("Nuevo ancho: " + rectangulo.getAncho());
        System.out.println("Nuevo alto: " + rectangulo.getAlto());
    }
}
