import Entities.Persona;
import Servicies.PersonaService;

public class PersonaMain {
    
    public static void main(String[] args) {
        PersonaService persona1 = new PersonaService();
        Persona pers1 = persona1.crearPersona();
        System.out.println("Nombre: " + pers1.getNombre() + "\nEdad: " + pers1.getEdad() + "\nDNI: " +pers1.getDni());
    }
    
}