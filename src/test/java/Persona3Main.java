
import Entities.Persona3;
import Servicies.Persona3Servicios;


public class Persona3Main {

    public static void main(String[] args) {
       
        Persona3Servicios persona1 = new Persona3Servicios();
        Persona3 persona = new Persona3();
        persona1.crearPersona();
        persona1.mostrarPersona(persona);
    }
    
}
