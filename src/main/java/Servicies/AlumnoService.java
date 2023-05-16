/*
 En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicies;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public AlumnoService() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.listaAlumnos = new ArrayList<>();
    }
    
     public void crearAlumno() {

        String op = "";
        while (!op.equalsIgnoreCase("n")) {
            System.out.println("Ingrese un nuevo alumno: ");
            String nombre = sc.next();
           
            for (int i = 0; i < ; i++) {
               
            }
            System.out.println("ingrese nota 1");
            
            
            razasLista.add(new Razas(raza));
            System.out.println("quiere ingresar otra? (s/n)");
            op = sc.next();
            if (op.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
