
import Entities.Persona2;
import Servicies.Persona2Servicios;

public class Persona2Main {

    public static void main(String[] args) {
        Persona2Servicios pers = new Persona2Servicios();
        Persona2 p1 = pers.crearPersona();
        //pers.crearPersona();
        String persona = p1.toString();
        System.out.println(persona);
    }

}
