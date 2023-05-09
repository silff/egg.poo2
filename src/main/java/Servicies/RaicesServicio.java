/*Luego, en RaicesServicio las operaciones que se podrán 
realizar son las siguientes:

Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo
delante de -b
 */
package Servicies;

import Entities.Raices;

public class RaicesServicio {

    Raices raices = new Raices();

    /*Método getDiscriminante(): devuelve el valor del discriminante (double). 
    El discriminante tiene la siguiente fórmula: (b^2)-4*a*c */
    public double getDiscriminante(Raices raices) {

        return Math.pow(raices.getB(), 2) - 4 * raices.getA()
                * raices.getC();
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
    para que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    public boolean tieneRaices(Raices raices) {

        return getDiscriminante(raices) >= 0;
    }

    /* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
    para que esto ocurra, el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz(Raices raices) {

        return getDiscriminante(raices) == 0;
    }

    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones. */
    public void obtieneRaices(Raices raices) {

        double r1, r2;
        if (tieneRaices(raices) == true) {
            r1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            r2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las dos raices son: R1 =  " + r1 + " y R2 = " + r2);
        }
    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.*/
    public void obtieneRaiz(Raices raices) {

        double r1;
        if (tieneRaiz(raices) == true) {
            r1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las dos raices son: R1 =  " + r1);
        }
    }

    /* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
    por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.*/
    public void calcular(Raices raices) {
           if (tieneRaices(raices)) {
               obtieneRaices(raices);
           } else if (tieneRaiz(raices)) {
               obtieneRaiz(raices);
           } else {
               System.out.println("No tiene solucion");
           }
       }
    
}
