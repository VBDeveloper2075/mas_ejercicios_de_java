/*Clase4

        Temas
        - Manejo de Fechas y Horas [Clase LocalDate y LocalDateTime].
        - Manejo de Operaciones Matemáticas [Clase Math].

        Ejercicios
        1 . ¿Que es la inmutabilidad?
        ....La inmutabilidad es una propiedad de la clase String: una vez que se crea una cadena, no se puede
        modificar. Cualquier operación que parezca modificar la cadena en realidad crea una nueva cadena.

        2 . Explica la diferencia entre las formas de instanciar las clases  ‘LocalDate’ y ‘LocalDateTime’, no te
        olvides de usar vocabulario técnico.
        ....Estas clases forman parte del paquete java.time introducido en Java 8, proporcionando una API moderna
        y más robusta para el trabajo con fechas y horas sin tener en cuenta la zona horaria.
        LocalDate es una clase que representa una fecha. Representa una fecha en el calendario ISO (año-mes-día) y
        proporciona métodos para realizar operaciones y manipulaciones en fechas.
        LocalDateTime es una extensión de LocalDate y agrega información sobre la hora del día. Esto proporciona un
        manejo más detallado de fechas y horas juntas.

        3 . ¿Puede compararse un LocalDate y un LocalDateTime explícitamente?
        ....No, no se puede comparar un LocalDate y un LocalDateTime explícitamente. Porque LocalDate solo contiene
        información de año, mes y día, mientras que LocalDateTime contiene información de año, mes,
        día, hora, minuto, segundo y nanosegundo.  Al intentar comparalos da un error de compilación porque no son del mismo tipo y no tienen una relación de herencia que permita una comparación directa. Para compararlos hay q convertir el LocalDateTime a un LocalDate utilizando el método toLocalDate() del objeto LocalDateTime. Al hacerlo estarìa ignorando lainformación de la hora en el objeto LocalDateTime.

        4 . Explica cómo podrías utilizar Math.random() para generar números aleatorios en un rango específico y cómo
        sería útil en el contexto financiero.
        ....Math.random() devuelve un número aleatorio entre 0.0 y 1.0. Para generar números aleatorios en un rango
        específico se puede utilizar la siguiente fórmula:
        Math.random() * (max - min + 1) + min
        donde max es el valor máximo del rango y min es el valor mínimo del rango.
        En el contexto financiero se es ùtil para generar números aleatorios que representen el valor de una
        acción en la bolsa de valores y asì poder simular el comportamiento de dicha acción en el tiempo.


        5 . Escribe un programa en que dado un número ingresado por teclado (del 1 a 7) escriba el correspondiente
        nombre del día de la semana.
*/

import java.util.Scanner;

public class DiaSemanaC4 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Por favor, ingrese un número del 1 al 7:");
                int dia = scanner.nextInt();
                String diaSemana = switch (dia) {
                    case 1-> "Lunes";
                    case 2-> "Martes";
                    case 3-> "Miercoles";
                    case 4-> "Jueves";
                    case 5-> "Viernes";
                    case 6-> "Sabado";
                    case 7-> "Domingo";
                    default-> "Dia no valido";
                };
                System.out.println(diaSemana);
                scanner.close();
            }
        }
