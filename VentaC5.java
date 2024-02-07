/**
 *                                        //-- EJERCITACION DE CLASE 5 --//
 *3) Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
 *    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
 *    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
 *    imprimir por pantalla los atributos del objeto de la siguiente forma:
 *    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
 *        a. Inicialice el objeto con los atributos necesarios
 *        b. Imprima por pantalla el objeto inicializado.
  */


public class VentaC5 {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public VentaC5(int identificador, String descripcion, int cantidad, double precioUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal() {
        return this.cantidad * this.precioUnitario;
    }

    public void imprimirItemVenta() {
        System.out.println("ItemVenta[id= " + this.identificador + ", descripcion= " + this.descripcion + ", cantidad= " + this.cantidad +
                ", pUnitario=" + this.precioUnitario + ", pTotal=" + this.calcularPrecioTotal() + "]");
    }

    public static void main(String[] args) {
        VentaC5 itemVenta1 = new VentaC5(1, "Papas", 2, 100);
        itemVenta1.imprimirItemVenta();
    }
}
