/* A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
todos los métodos para cada objeto, deberá comprobar si la persona está en su peso 
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto 
si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.
 */

import Entities.Persona2;
import Servicies.Persona2Servicios;

public class Persona2Main {

    public static void main(String[] args) {
        Persona2Servicios perS = new Persona2Servicios();
        Persona2[] p = new Persona2[4];
        boolean[] mayor = new boolean[4];
        int[] IMC = new int[4];
        for (int i = 0; i < 4; i++) {
            p[i] = perS.crearPersona();
        }
        
        for (int i = 0; i < 4; i++) {
            mayor[i] = perS.esMayorDeEdad(p[i]);
            IMC[i] = perS.calcularIMC(p[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(p[i]);
        }
        
        perS.porcentajeIMC(p, IMC);
    }

}
