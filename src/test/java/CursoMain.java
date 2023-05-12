
import Servicies.CursoServicios;

public class CursoMain {

    public static void main(String[] args) {

        CursoServicios cursoS = new CursoServicios();
        cursoS.cargarAlumnos();
        cursoS.mostrarAlumnos();
        cursoS.crearCurso();
        cursoS.calcularGananciaSemanal();
    }

}
