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

 */
package Servicies;

import Entities.Persona2;

import java.util.Scanner;

public class Persona2Servicios {

    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona2 crearPersona() {
        Persona2 persona = new Persona2();
        System.out.println("Nombre");
        persona.setNombre(sc.next());
        System.out.println("Edad");
        persona.setEdad(sc.nextInt());
        do {
            System.out.println("Sexo (H/M/O)");
            persona.setSexo(sc.next());
        } while (!persona.getSexo().equalsIgnoreCase("H") && !persona.getSexo().equalsIgnoreCase("M")
                && !persona.getSexo().equalsIgnoreCase("O"));

        System.out.println("Peso (kgs)");
        persona.setPeso(sc.nextDouble());
        System.out.println("Altura (mts)");
        persona.setAltura(sc.nextDouble());
        return persona;
    }

    public boolean esMayorDeEdad(Persona2 persona) {
        boolean mayor = false;
        if (persona.getEdad() > 17) {
            mayor = true;
        }
        return mayor;
    }

    public int calcularIMC(Persona2 persona) {
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());

        int ind;
        if (IMC < 20) {
            ind = -1;
        } else if (IMC > 25) {
            ind = 1;
        } else {
            ind = 0;
        }
        return ind;
    }

    public void porcentajeIMC(Persona2[] p, int[] IMC) {
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;

        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case -1:
                    aux1++;
                    break;
                case 0:
                    aux2++;
                    break;
                case 1:
                    aux3++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("porcentaje bajo imc " + aux1 * 100 / 4);
        System.out.println("porcentaje medio imc " + aux2 * 100 / 4);
        System.out.println("porcentaje alto imc " + aux3 * 100 / 4);

    }

    public void porcentajeMayoresMenores(Persona2[] p, boolean[] mayor) {
        int aux1 = 0;
        int aux2 = 0;

        for (int i = 0; i < 4; i++) {
            if (mayor[i] == true) {
                aux1++;
            } else {
                aux2++;
            }
        }
        System.out.println("porcentaje mayores " + aux1 * 100 / 4);
        System.out.println("porcentaje menores " + aux2 * 100 / 4);
    }
}
