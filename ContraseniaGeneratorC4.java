/*Clase4
        6 . Escribe un programa que genere y muestre una contraseña aleatoria. La contraseña debe tener una longitud
        específica y contener caracteres alfanuméricos.
*/

import javax.swing.*;

public class ContraseniaGeneratorC4 {
    public static void main(String[] args) {
        JOptionPane.showInputDialog("Por favor, ingrese su Nombre de Usuario:  ");
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ahora un numero del 1 al 9 y generaremos una " +
                "contrasenia segura para Usted:  "));

// PRIMERO llamo al metodo que genera la contrasenia:
        generarContrasenia(longitud);
    }

// SEGUNDO creo el metodo que genera la contrasenia:
    public static void generarContrasenia (int longitud){

// TERCERO un String vacio, que se va a ir llenando con los numeros aleatorios que se generen:
        String contrasenia = "";
        for (int i = 0; i < longitud; i++) {
            int numeroAleatorio = (int) (Math.random() * 10);

// POR ULTIMO al numero aleatorio lo sumo a contrasenia. Hasta que tenga la longitud que indico el usuario: (porque es
// lo mismo que hacer contrasenia = contrasenia + numeroAleatorio;)
            contrasenia += numeroAleatorio;
        }

        JOptionPane.showMessageDialog(null, "Nueva contrasenia: " + contrasenia);
    }
}


