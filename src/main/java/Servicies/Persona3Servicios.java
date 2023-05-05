/* Crear una clase PersonaService, en el paquete servicio, con los siguientes 
métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona 
a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha 
de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicies;

import Entities.Persona3;
import java.time.LocalDate;
import java.util.Scanner;

public class Persona3Servicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona3 crearPersona() {

        Persona3 personaS = new Persona3();
        System.out.println("nombre");
        personaS.setNombre(sc.nextLine());
        System.out.println("año de nacimiento");
        int anio = sc.nextInt();
        System.out.println("mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("dia de nacimiento");
        int dia = sc.nextInt();
        personaS.setFechaNacimiento(LocalDate.of(anio, mes, dia));

        return personaS;
    }
}
