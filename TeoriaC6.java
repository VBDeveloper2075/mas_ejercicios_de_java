public class TeoriaC6 {
    /*
Parte 2
Clase 6
Temas
Modificadores de Acceso.
        Static & Non-Static.
        Ejercicios
        Teóricos

1) Explica brevemente el propósito de los modificadores de acceso public, private y protected. ¿Cómo afectan la visibilidad de los miembros de una clase?

--- Los modificadores de acceso en la programación orientada a objetos controlan la visibilidad de los miembros (atributos y métodos) de una clase. Determinan desde dónde se puede acceder a esos miembros.
*El modificador public permite el acceso a los miembros de una clase desde cualquier otra clase. ntextos. Permite que
otros desarrolladores utilicen y extiendan la funcionalidad de la clase, facilitando la colaboración.
*El modificador private permite el acceso a los miembros de una clase solo desde la misma clase. Permite un control preciso sobre quién puede modificar o acceder a los miembros de la clase.
*El modificador protected permite el acceso a los miembros de una clase desde la misma clase y desde las subclases (incluso si están en paquetes diferentes).
No es accesible fuera del paquete si no es una subclase.


2) ¿Por qué es importante encapsular los atributos de una clase mediante el uso de modificadores de acceso?
--- Es importante encapsular los atributos de una clase mediante el uso de modificadores de acceso para proteger los
datos de la clase y para que no sean modificados por otras clases. Esto permite que los datos de la clase sean
accesibles solo a través de métodos de la clase, protegiendo datos importantes y evitando que se modifiquen de manera
inesperada.

3) Proporciona al menos dos beneficios de encapsular datos. ¿Cómo afecta esto a la llamada de métodos y al acceso a los miembros de una clase?

--- Los beneficios de encapsular datos son:
*El encapsulamiento implica ocultar los detalles internos de una clase y proporcionar una interfaz pública para interactuar con ella. Los atributos de la clase deben ser privados, y el acceso a ellos se controla mediante métodos públicos (getters y setters).
*El encapsulamiento permite que los detalles internos de una clase cambien sin afectar a las clases que la utilizan. Esto facilita el mantenimiento y la evolución del código.

4) ¿En qué situaciones sería apropiado utilizar un miembro estático en una clase? Proporciona ejemplos concretos para ilustrar su utilidad.

--- Un miembro estático en una clase es apropiado cuando se desea que el miembro pertenezca a la clase en lugar de a una instancia específica de la clase. Algunas situaciones en las que sería apropiado utilizar un miembro estático incluyen:
*Contadores: un miembro estático se puede utilizar para mantener un contador que se incrementa cada vez que se crea una nueva instancia de la clase. Los miembros estáticos se utilizan comúnmente para métodos de utilidad, constantes o variables que no son específicos de instancias individuales. Por ejemplo, una clase Math que contiene funciones matemáticas.


*/

}
