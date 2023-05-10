/* Crear una clase PersonaService, en el paquete servicio, con los siguientes 
métodos:
 */
package Servicies;

import Entities.Persona3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Persona3Servicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
    persona a crear. Retornar el objeto Persona creado.*/
    public Persona3 crearPersona() {

        Persona3 persona = new Persona3();
        System.out.println("nombre");
        persona.setNombre(sc.nextLine());
        System.out.println("año de nacimiento");
        int anio = sc.nextInt();
        sc.nextLine();
        System.out.println("mes de nacimiento");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.println("dia de nacimiento");
        int dia = sc.nextInt();
        sc.nextLine();
        persona.setFechaNacimiento(LocalDate.of(anio, mes,
                dia));

        return persona;

    }

    /*Método calcularEdad que calcule la edad del usuario utilizando el atributo
    de fecha de nacimiento y la fecha actual.*/
    public long calcularEdad(Persona3 persona) {

        LocalDate fechaNacimiento = persona.getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();

        long edad = ChronoUnit.YEARS.between(fechaNacimiento,
                fechaActual);
       
        return edad;
    }

    /*Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
    persona es menor que la edad consultada o false en caso contrario.*/
    public boolean menorQue(Persona3 persona, long edadComparar) {

        long edad = calcularEdad(persona);
        boolean menorQue = edad > edadComparar;
        return menorQue;
    }

    /*Método mostrarPersona que muestra la información de la persona deseada.*/
    public void mostrarPersona(Persona3 persona) {

        System.out.println(persona.getNombre() + " " + persona.getFechaNacimiento());
    }
}
