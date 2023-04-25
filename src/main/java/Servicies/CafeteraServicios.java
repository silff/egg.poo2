/*
Crear clase
CafeteraServicio en el paquete Servicios con los siguiente:
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado 
en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicies;

import Entities.Cafetera;
import java.util.Scanner;

public class CafeteraServicios {
    
    static Scanner sc = new Scanner(System.in);
    static Cafetera cafetera = new Cafetera();
    
    public void llenarCafetera() {
        cafetera.setCantidadMaxima(100);
        cafetera.setCantidadActual(cafetera.getCantidadMaxima());
    }
    
     public void servirTaza() {
            
         
        }
}
