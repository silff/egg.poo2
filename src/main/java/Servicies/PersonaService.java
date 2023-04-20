
 
package Servicies;

import Entities.Persona;
import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        Persona personaCompleta = new Persona();
        System.out.println("ingrese nombre");
        personaCompleta.setNombre(sc.nextLine());
        System.out.println("ingrese edad");
        personaCompleta.setEdad(sc.nextInt());
        System.out.println("ingrese dni");
        personaCompleta.setDni(sc.nextInt());

        return personaCompleta;
    }

}
