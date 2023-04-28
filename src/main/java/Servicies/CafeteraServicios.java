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

    private Scanner sc = new Scanner(System.in);
    private Cafetera cafetera = new Cafetera();
    
    public void llenarCafetera() {
        //cafetera.setCantidadMaxima(100);
        cafetera.setCantidadActual(cafetera.getCantidadMaxima());
    }

    public void servirTaza() {
        System.out.println("ingrese el tamaño de la taza");
        int taza = sc.nextInt();

        if (taza <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        } else {
            System.out.println("cantidad insuficiente para completar la taza");
            System.out.println("solo se llenara hasta " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe() {
        System.out.println("cuanto cafe quiere agregar?");
        int cafe = sc.nextInt();
        if (cafe + cafetera.getCantidadActual() > cafetera.getCantidadMaxima()) {
            System.out.println("Excede la cantidad maxima. Se completara la capacidad");
            cafetera.setCantidadActual(cafetera.getCantidadMaxima());
        } else {
            cafetera.setCantidadActual(cafe + cafetera.getCantidadActual());
        }
    }

    public void mostarCafetera() {
        System.out.println("Cantidad actual " + cafetera.getCantidadActual()
                + "\nCapacidad maxima " + cafetera.getCantidadMaxima());

    }

    public void salir() {

    }

    public void menu() {
        System.out.println("MENU");
        System.out.println("A - Llenar cafetera");
        System.out.println("B - Servir taza");
        System.out.println("C - Vaciar cafetera");
        System.out.println("D - Agregar cafe");
        System.out.println("E - Mostrar cafetera");
        System.out.println("F - Salir");

        String opcion = sc.next();

        switch (opcion.toUpperCase()) {
            case "A":
                llenarCafetera();
                menu();
                break;
            case "B":
                servirTaza();
                menu();
                break;
            case "C":
                vaciarCafetera();
                menu();
                break;
            case "D":
                agregarCafe();
                menu();
                break;
            case "E":
                mostarCafetera();
                menu();
                break;
            case "F":
                salir();
                break;
            default:
                break;
        }

    }

}
