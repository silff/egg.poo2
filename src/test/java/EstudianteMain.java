
import Entities.Estudiante;
import Servicies.EstudianteServicios;

/*
 */
public class EstudianteMain {

    public static void main(String[] args) {
        EstudianteServicios estudianteS = new EstudianteServicios();
        Estudiante[] est = estudianteS.crearEstudiante();

    }

}
