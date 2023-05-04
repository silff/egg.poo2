/*
 */
package Servicies;

import Entities.ParDeNumeros;

public class ParDeNumerosServicios {

    public ParDeNumeros crearPares() {
        return new ParDeNumeros();

    }

    public void mostrarValores(ParDeNumeros pdn) {
        System.out.println(pdn.toString());

    }

    public double devolverMayor(ParDeNumeros pdn) {
        double mayor = Math.max(pdn.getPar1(), pdn.getPar2());
        return mayor;
    }

    public double calcularPotencia(ParDeNumeros pdn) {
        double mayor =  Math.round(devolverMayor(pdn));
        double menor =  Math.round(Math.min(pdn.getPar1(), pdn.getPar2()));
        return Math.round(Math.pow(mayor, menor));

    }

    public double calculaRaiz(ParDeNumeros pdn) {

        double menor = Math.min(Math.abs(pdn.getPar1()), Math.abs(pdn.getPar2()));
        return Math.sqrt(menor);

    }
}
