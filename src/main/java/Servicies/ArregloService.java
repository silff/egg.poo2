/*
Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package Servicies;

public class ArregloService {
    
    public void inicializarA(double A[]) {
        
        for (int i = 0; i < A.length; i++) {
               A[i] =  Math.random() * 10;
        }
      
    }
     public void mostrarA(double A[]) {
         for (int i = 0; i < A.length; i++) {
              System.out.println(A[i]);
         }
        
     }
}
