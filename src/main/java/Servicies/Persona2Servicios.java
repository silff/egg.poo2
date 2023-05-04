/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensa
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, 
si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, 
y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
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
package Servicies;

import Entities.Persona2;
//import Entities.Persona2Sexo;
import java.util.Scanner;

public class Persona2Servicios {

    public Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona2 crearPersona() {
        Persona2 persona = new Persona2();
        System.out.println("Nombre");
        persona.setNombre(sc.nextLine());
        System.out.println("Edad");
        persona.setEdad(sc.nextInt());
        do {
            System.out.println("Sexo (H/M/O)");
            persona.setSexo(sc.nextLine());
        } while (!persona.getSexo().equalsIgnoreCase("H") && !persona.getSexo().equalsIgnoreCase("M")
                && !persona.getSexo().equalsIgnoreCase("O"));

        System.out.println("Peso");
        persona.setPeso(sc.nextDouble());
        System.out.println("Altura");
        persona.setAltura(sc.nextDouble());
        return persona;
    }

    /* public boolean esMayorDeEdad() {
        if (edad) {
            
        }
        return ;
    }
    
    public void calcularIMC() {
        
    }*/
}
