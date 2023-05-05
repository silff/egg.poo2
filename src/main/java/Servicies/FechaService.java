/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package Servicies;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class FechaService {

    private Scanner sc = new Scanner(System.in);

    public LocalDate fechaNacimiento() {
        System.out.println("dia de nacimiento");
        int dia = sc.nextInt();
        System.out.println("mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("anio de nacimiento");
        int anio = sc.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }

    public LocalDate fechaActual() {
        LocalDate fechaAct = LocalDate.now();
        return fechaAct;
    }

    public void diferencia() {
        LocalDate fechaNacimiento = fechaNacimiento();
        LocalDate fechaActual = fechaActual();
        long edad = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        System.out.println("Tienes " + edad + " años.");

    }
}
