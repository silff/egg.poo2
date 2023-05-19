
import Servicies.AlumnoService;

public class AlumnoMain {

    public static void main(String[] args) {
      
        AlumnoService listaAlumnos = new AlumnoService();
        listaAlumnos.crearAlumnos(3);
        listaAlumnos.mostrarAlumnos();
       // listaAlumnos.notaFinal();
    }
    
}
