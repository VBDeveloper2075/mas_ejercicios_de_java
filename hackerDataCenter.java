/*
* Eres ingeniero de un data center y están atacando los servidores. No sabes cual, pero puedes probar cualquier servidor para saber cual es el indicado. el juego se juega en una cuadricula de servidores. El servidor en la esquina superior izquierda es (0,0). x define la columna y e define la fila.

En cada turno tienes tu posicion actual x,y y la direccion al servidor comprometido.

U:ARRIBA: el servidor de destino esta encima de usted
UR:ARRIBA a la derecha: el servidor de destino esta encima de usted y a su derecha.
D:derecha: el servidor de destino esta a la derecha
DR: ABAJO DERECHA el servidor de destino esta debajo de usted y a su derecha.
D: ABAJO. el servidor de destino esta debajo de usted.
DL:abajo a la izquierda: el servidor de destino esta debajo de usted y a su izquierda.
L: izquierda: el servidor de destino esta a la izquierda.
UL:ARRIBA a la izquierda: el servidor de destino esta encima de usted y a su izquierda.

Debe devolver la ubicacion del servidor que desea sondear como una matriz de dos numeros enteros x,y hasta encontrar el servidor comprometido.
Para tener exito en tu mision debes encontrar el servidor lo mas rapido posible, antes de que el hacker se infiltre en tu red, lo cual esta representado por un numero maximo de intentos.
sus coordenadas iniciales no siempre son (0,0) y la direccion inicial no siempre es "DR".
Implemente el metodo solve (direccion,x,y,ancho,alto)donde los parametros son:direccion x,y width height*/

import org.jetbrains.annotations.NotNull;

public class hackerDataCenter {

    public int[] solve(@NotNull String direction, int x, int y, int width, int height) {

        int[] result = new int[2];
        switch (direction) {
            case "U":
                result[0] = x;
                result[1] = y - 1;
                break;
            case "UR":
                result[0] = x + 1;
                result[1] = y - 1;
                break;
            case "R":
                result[0] = x + 1;
                result[1] = y;
                break;
            case "DR":
                result[0] = x + 1;
                result[1] = y + 1;
                break;
            case "D":
                result[0] = x;
                result[1] = y + 1;
                break;
            case "DL":
                result[0] = x - 1;
                result[1] = y + 1;
                break;
            case "L":
                result[0] = x - 1;
                result[1] = y;
                break;
            case "UL":
                result[0] = x - 1;
                result[1] = y - 1;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        hackerDataCenter hackerDataCenter = new hackerDataCenter();
        int[] result = hackerDataCenter.solve("DR", 0, 0, 5, 5);
        System.out.println(result[0] + " " + result[1]);
    }
}

//al ejecutar este codigo en el juego muestra un error en el (13,13)
//El error es que el hacker se infiltro en la red antes de que el ingeniero pudiera encontrarlo.


//El codigo anterior es una solucion recursiva que se llama a si misma hasta que se encuentra el servidor comprometido.