/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
*/
package Servicies;

import Entities.Estudiante;
import java.util.Scanner;

public class EstudianteServicios {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante[] crearEstudiante() {
        
        Estudiante[] e = new Estudiante[8];
        double notaP;
        for (int i = 0; i < e.length; i++) {
            System.out.println("nombre estudiante");
            e[i].setNombre(sc.next());
            System.out.println("nota parcial");
            notaP = sc.nextDouble();
            Estudiante est = new Estudiante(e[i].getNombre(), notaP);
        }
       return e; 
    } 
}
