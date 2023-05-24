
import Servicies.AlumnoService;

public class AlumnoMain {

    public static void main(String[] args) {
      
        AlumnoService listaAlumnos = new AlumnoService();
        listaAlumnos.crearAlumnos();
        listaAlumnos.mostrarAlumnos();
        listaAlumnos.buscarAlumno();
       
    }
    
}
