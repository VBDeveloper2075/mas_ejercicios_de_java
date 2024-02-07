/**
 *                                        //-- EJERCITACION DE CLASE 5 --//
 *1) Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
 *    1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
 *    debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
 *    siguientes pruebas:
 *    a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
 *    b. Imprimir por pantalla el alto y ancho.
 *    c. Imprimir por pantalla el área y perímetro.
 *    d. Modificar el alto y el ancho de la instancia.
 *    e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
 *    f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
 */


public class RectanguloC5 {
    private double ancho;
    private double alto;

    public RectanguloC5(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public RectanguloC5() {
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    public double calcularArea() {
        return this.ancho * this.alto;
    }

    public double calcularPerimetro() {
        return (this.ancho + this.alto) * 2;
    }

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

    public static void main(String[] args) {
        RectanguloC5 rectangulo1 = new RectanguloC5(2.0, 3.0);
        System.out.println("Ancho: " + rectangulo1.getAncho() + ", Alto: " + rectangulo1.getAlto());
        System.out.println("Area: " + rectangulo1.calcularArea() + ", Perimetro: " + rectangulo1.calcularPerimetro());

        rectangulo1.setAncho(4.0);
        rectangulo1.setAlto(5.0);
        System.out.println("Ancho: " + rectangulo1.getAncho() + ", Alto: " + rectangulo1.getAlto());
        System.out.println("Area: " + rectangulo1.calcularArea() + ", Perimetro: " + rectangulo1.calcularPerimetro());

        RectanguloC5 rectangulo2 = new RectanguloC5();
        System.out.println("Ancho: " + rectangulo2.getAncho() + ", Alto: " + rectangulo2.getAlto());
        System.out.println("Area: " + rectangulo2.calcularArea() + ", Perimetro: " + rectangulo2.calcularPerimetro());
    }
}
