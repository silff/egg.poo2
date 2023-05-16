/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
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

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos = new ArrayList();
    Alumno alumno = new Alumno();

    public AlumnoService() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        String op = "";

        while (!op.equalsIgnoreCase("n")) {

            System.out.println("Ingrese un nuevo alumno: ");
            alumno.setNombre(sc.next());

            int n = 3; //cantidad de notas

            for (int i = 0; i < n; i++) {
                System.out.println("ingrese nota " + (i + 1));
                int notas = sc.nextInt();
                alumno.agregarNota(notas);
            }
            alumnos.add(alumno);
            System.out.println("quiere ingresar otro alumno? (s/n)");
            op = sc.next();
            if (op.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println(alumnos.toString());

    }
}
