    //-- EJERCITACION DE CLASE --//
/*2) Escribe un programa que calcule el factorial de un número ingresado por el usuario,
 *      pero permitiendo calcular el factorial de varios números consecutivos.
 */

import java.util.Scanner;
//importo libreria para usar scanner, para poder ingresar datos por consola y guardarlos en variables.

public class FactorialDe0a16  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero  de 0 a 16 - para calcular su factorial: ");
//      guardo en una variable el numero ingresado por consola.
        int numero = scanner.nextInt();
//      creo una variable para guardar el factorial del numero ingresado y la inicializo en 1.
        int factorial = 1;
//      recorro todos los numeros desde 1 hasta el numero ingresado por consola.
        for (int i = 1; i <= numero; i++) {
//      multiplico el factorial por el numero que se esta recorriendo.
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
//      Cierro el scanner
        scanner.close();
    }
}

