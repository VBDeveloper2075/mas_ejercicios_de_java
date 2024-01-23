
/*Clase4 ---- OTRA FORMA DE HACERLO ---- CON LETRAS Y NUMEROS ALEATORIOS:
    6 . Escribe un programa que genere y muestre una contraseña aleatoria. La contraseña debe tener una longitud
    específica y contener caracteres alfanuméricos.
*/

import javax.swing.*;

public class ContraseniaGenerator222C4 {

    public static void main(String[] args) {
        JOptionPane.showInputDialog("Por favor, ingrese su Nombre de Usuario:  ");
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ahora un numero del 1 al 9 y generaremos una " +
                "contrasenia segura para Usted:  "));

// PRIMERO llamo al metodo que genera la contrasenia:
        generarContrasenia(longitud);

// Indicar que el programa ha finalizado
        JOptionPane.showMessageDialog(null, "El programa ha finalizado.");

// Evitar que el programa se cierre hasta que el usuario cierre el último cuadro de diálogo
        System.exit(0);
    }

    // SEGUNDO creo el metodo que genera la contrasenia:
    public static String generarContrasenia (int longitud){
        String caracteresPosibles = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder contrasenia = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = (int) (Math.random() * caracteresPosibles.length());
            char caracterAleatorio = caracteresPosibles.charAt(indiceAleatorio);
            contrasenia.append(caracterAleatorio);
        }

        JOptionPane.showMessageDialog(null, "Nueva contrasenia: " + contrasenia);

        return caracteresPosibles;
    }
}


