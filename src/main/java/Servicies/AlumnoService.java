/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
 */
package Servicies;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    private final Scanner sc;
    private final ArrayList<Alumno> alumnos;

    public AlumnoService() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        String op;

        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese un nuevo alumno: ");
            alumno.setNombre(sc.next());
            int n = 3; //cantidad de notas
            for (int i = 0; i < n; i++) {
                System.out.println("ingrese nota " + (i + 1));
                int nota = sc.nextInt();
                alumno.agregarNota(nota);
            }
            alumnos.add(alumno);

            System.out.println("quiere ingresar otro alumno? (s/n)");
            op = sc.next();
            if (op.equalsIgnoreCase("N")) {
                break;
            }
            while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Desea seguir ingresando mas alumnos: S/N");
                op = sc.next();
            }
        } while (op.equalsIgnoreCase("S"));
    }

    public void mostrarAlumnos() {
        System.out.println(alumnos.toString());
    }

    /*Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular 
    su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama 
    al método. Dentro del método se usará la lista notas para calcular el promedio 
    final de alumno. Siendo este promedio final, devuelto por el método y mostrado
    en el main.*/
    public void buscarAlumno() {
        System.out.println("ingrese nombre de alumno para calcular");
        String nombre = sc.next();
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                
                System.out.println(notaFinal(alumno));
                return;
            }
        }
        System.out.println("alumno no encontrado");
    }

    public double notaFinal(Alumno alumno) {
        ArrayList<Double> notas = alumno.getNotas();
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        double promedio = sum / notas.size();
        return promedio;
    }
}
