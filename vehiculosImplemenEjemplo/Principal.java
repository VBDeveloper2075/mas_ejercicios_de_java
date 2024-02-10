package vehiculosImplemenEjemplo;

public class Principal {
    public static void main(String[] args) {
        Coche autoDeVero = new Coche();
        autoDeVero.arrancar();
        autoDeVero.detener();

        Lancha lanchaDeVero = new Lancha();
        lanchaDeVero.arrancar();
        lanchaDeVero.detener();
    }
}
