/**
 *                                        //-- EJERCITACION DE CLASE 5 --//
 *2) Modele el objeto Empleado que posee las siguientes características, dni, nombre,
 *    apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
 *    anual. A su vez se requiere otro método que permita aumentar el salario
 *    dependiendo del porcentaje que se le pase por parámetro. Considere crear un
 *    método que facilite imprimir por pantalla las características del objeto de la
 *    siguiente forma:
 *        Empleado[dni=?, nombre=?, apellido=?, salario=?]
 *        a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
 *        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
 *        c. Imprima ambos objetos por pantalla
 *        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
 */


public class EmpleadoC5 {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public EmpleadoC5(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double salarioAnual() {
        return this.salario * 12;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    public void imprimirEmpleado() {
        System.out.println("Empleado[dni= " + this.dni + ", nombre= " + this.nombre + ", apellido= " + this.apellido +
                ", salario=" + this.salario + "]");
    }

    public static void main(String[] args) {
        EmpleadoC5 empleado1 = new EmpleadoC5(23456345, "Carlos", "Gutiérrez", 25000);
        EmpleadoC5 empleado2 = new EmpleadoC5(34234123, "Ana", "Sánchez", 27500);

           empleado1.imprimirEmpleado();

        empleado1.aumentarSalario(15);
        System.out.println("Salario anual de Carlos: " + empleado1.salarioAnual());
    }
}
