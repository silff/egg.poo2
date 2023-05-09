
import Entities.Estudiante;
import Servicies.EstudianteServicios;

public class EstudianteMain {

    public static void main(String[] args) {

        EstudianteServicios estS = new EstudianteServicios();

        Estudiante[] estu = new Estudiante[2];
        estS.crearEstudiante(estu);
        System.out.println("Promedio del curso " + estS.mostrarPromedio(estu));
        estS.notaMayor(estu);
        estS.mostrar(estS.notaMayor(estu));

    }

}
