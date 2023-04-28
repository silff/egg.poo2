/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los 
atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar
constructor vacío y con parámetros así como setters y getters. 
 */
package Entities;

public class Cafetera {
    
    //attrib
    int cantidadMaxima = 100;
    int cantidadActual;
    
    //constructors
    public Cafetera() {
    }

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //getters y setters
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
