/*
PARTE 2
Clase5
Temas
*Introducción Programación Orientada a Objetos.
*Modificadores de Acceso.
*Static & Non-Static.
Ejercicios
1.. ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas instancias de esta clase?
....Los atributos de la clase PilotoDeFormula1 podrían ser: nombre, apellido, edad, nacionalidad, escudería, número
de coche, puntos, victorias, podios, campeonatos. Algunas instancias de esta clase podrían ser: Lewis Hamilton, Juan
Manuel Fangio, Onofre Manimon, Ayrton Senna, Michael Schumacher, Sebastian Vettel, Fernando Alonso, Max Verstappen.

2.. A continuación tienes una lista en la que están mezcladas varias clases con instancias de esas clases. Para ponerlo
un poco más difícil, todos los elementos están escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece cada una de estas instancias y cuál es la jerarquía entre las clases: paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.
....Clases: Perro, Mineral, Caballo, Gato, Animal, Persona. En este caso Perro, Caballo y Gato son subclases de Animal.
....Instancias: paula, goofy, gardfiel, tom, silvestre, pirita, rocinante, milu, snoopy, pluto, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, pato_lucas.
....Instancias de la clase Perro: goofy, gardfiel, milu, snoopy, pluto, laika.
....Instancias de la clase Gato: silvestre, tom.
....Instancias de la clase Caballo: rocinante, bucefalo, pegaso.
....Instancias de la clase Mineral: pirita, cuarzo.
....Instancias de la clase Persona: paula, javier.
....Instancias de la clase Animal: goofy, garfiel, milu, snoopy, pluto, laika, silvestre, tom, rocinante, bucefalo, pegaso, pirita, cuarzo, paula, javier, pato_lucas.

3.. ¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?
....Los atributos de la clase Vivienda podrían ser: dirección, cantidad de habitaciones, cantidad de baños,
metros2Cubiertos, metros2Descubiertos, tieneCochera, tieneAscensor, tienePatio, tienePileta, tieneQuincho.
Algunas subclases de Vivienda podrían ser: Casa, Departamento, PH, Quinta, Chalet, Monoambiente. Que no tendr[ian los
 mismos atributos que Vivienda, sino que podrian compartir algunos y tener otros propios. Porque, por ejemplo, un
 monoambiente no tedria pileta ni quincho, pero si cochera y ascensor. Mientras que una quinta no tendria ascensor ni
  cochera, pero si pileta y quincho. Y un departamento podria tener cochera y ascensor, pero no pileta ni quincho. Y un chalet podria tener cochera, pileta y quincho, pero no ascensor.

4.. Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los métodos pueden ser invierte, simplifica, multiplica, divide, etc.

*/

public class FraccionClase6 {
//   Atributos
    private int numerador;
    private int denominador;

//   Constructor
    public FraccionClase6(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

//   Metodos
//    Este metodo invierte el numerador y el denominador de la fraccion
    public FraccionClase6 invierte() {
        return new FraccionClase6(this.denominador, this.numerador);
    }

//    Este metodo simplifica la fraccion a su minima expresion
    public FraccionClase6 simplifica() {
        int mcd = mcd(this.numerador, this.denominador);
        return new FraccionClase6(this.numerador / mcd, this.denominador / mcd);
    }

    public FraccionClase6 multiplica(FraccionClase6 fraccion) {
        return new FraccionClase6(this.numerador * fraccion.numerador, this.denominador * fraccion.denominador);
    }

    public FraccionClase6 divide(FraccionClase6 fraccion) {
        return new FraccionClase6(this.numerador * fraccion.denominador, this.denominador * fraccion.numerador);
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public static void main(String[] args) {
        FraccionClase6 fraccion1 = new FraccionClase6(2, 3);
        FraccionClase6 fraccion2 = new FraccionClase6(3, 4);
        System.out.println(fraccion1.invierte());
        System.out.println(fraccion1.simplifica());
        System.out.println(fraccion1.multiplica(fraccion2));
        System.out.println(fraccion1.divide(fraccion2));
    }
}
