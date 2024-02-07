/**
 *                                        //-- EJERCITACION DE CLASE 5--//
 *4) Modele el objeto que representa la cuenta de un banco, con identificador, nombre
 *    y balance. Considere los getters, setters y constructores necesarios. Tenga en
 *    cuenta los siguientes métodos.
 *        a. El método crédito que representa un depósito de dinero en la cuenta. Este
 *            método debe devolver el balance luego de la operación.
 *        b. El método débito que representa una sustracción de dinero de la cuenta.
 *            Este método debe devolver el balance luego de la operación. Si el dinero en
 *            la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso.
 *        c. Un método que imprima por pantalla las características del objeto.
 * Realice las siguientes operaciones:
 *    1. Inicialice una cuenta con un monto inicial de 15000.
 *    2. Realice una operación de crédito de 2500.
 *    3. Realice una operación de compra de 1500.
 *    4. Realice una operación de compra de 30000.
 *    5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
 */


public class BancoC5 {
    private int identificador;
    private String nombre;
    private double balance;

    public BancoC5(int identificador, String nombre, double balance) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double credito(double monto) {
        this.balance += monto;
        return this.balance;
    }

    public double debito(double monto) {
        if (this.balance < monto) {
            System.out.println("El dinero en la cuenta no es suficiente para cubrir la sustracción");
        } else {
            this.balance -= monto;
        }
        return this.balance;
    }

    public void imprimirCuenta() {
        System.out.println("Cuenta[id= " + this.identificador + ", nombre= " + this.nombre + ", balance= " + this.balance + "]");
    }

    public static void main(String[] args) {
        BancoC5 cuenta1 = new BancoC5(1, "Cuenta1", 15000);
        cuenta1.credito(2500);
        cuenta1.debito(1500);
        cuenta1.debito(30000);
        cuenta1.imprimirCuenta();
    }
}
