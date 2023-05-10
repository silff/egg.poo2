
import Entities.Persona3;
import Servicies.Persona3Servicios;

public class Persona3Main {

    public static void main(String[] args) {

        Persona3Servicios persona1 = new Persona3Servicios();
        Persona3 persona = persona1.crearPersona();

        persona1.mostrarPersona(persona);
        System.out.println("edad " + persona1.calcularEdad(persona));
        System.out.println("ingrese una edad por parametro");
        System.out.println("es mayor que esa edad? " + persona1.menorQue(persona, 50));

    }

}
