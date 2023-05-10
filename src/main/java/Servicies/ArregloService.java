/*
Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
 */
package Servicies;

import java.util.Arrays;

public class ArregloService {

    /*Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
    aleatorios.*/
    public void inicializarA(double[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 10;
        }
    }

    /*Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.*/
    public void mostrarA(double[] A) {
        System.out.print(Arrays.toString(A));
    }

    /*Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.*/
    public void ordenar(double[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.println(A[i]);
        }
    }

    /*Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
    public void inicializarB(double[] A, double[] B) {
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, 20, 0.5);
    }
    
}
