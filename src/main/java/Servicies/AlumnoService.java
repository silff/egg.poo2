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
        Alumno alumno = new Alumno();
        do {
            System.out.println("Ingrese un nuevo alumno: ");
            String nombre = sc.next();
           
            int n = 3; //cantidad de notas
            ArrayList<Integer> notas = alumno.getNotas();
            for (int i = 0; i < n; i++) {
                System.out.println("ingrese nota " + (i + 1));
                int nota = sc.nextInt();
                notas.add(nota);

            }

            alumnos.add(new Alumno(nombre, notas));

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

        System.out.println(alumnos.toString());

        for (Alumno x : alumnos) {
            System.out.println(x);
        }

        

        /* String aux;
        do {

            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList();
            int nota;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i+1));
               
                notas.add(leer.nextInt());
            }

            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);

            System.out.println("Desea seguir ingresando mas alumnos: S/N");
            aux = leer.next();
            while (!aux.equalsIgnoreCase("S") && !aux.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Desea seguir ingresando mas alumnos: S/N");
                aux = leer.next();
            }

        } while (aux.equalsIgnoreCase("S"));
         */
    }

    private Alumno buscarAlumno(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                return alumno;
            }
        }
        return null;
    }

    /*Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular 
    su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama 
    al método. Dentro del método se usará la lista notas para calcular el promedio 
    final de alumno. Siendo este promedio final, devuelto por el método y mostrado
    en el main.*/
    public void notaFinal() {
        System.out.println("ingrese nombre de alumno para calcular");
        String nombre = sc.next();
        Alumno alumno = buscarAlumno(nombre);
        System.out.println(buscarAlumno(nombre));

    }
}


/*String nombre = sc.next();
    Alumno alumno = buscarAlumno(nombre);
    if (alumno != null) {
        double suma = 0;
        for (int nota : alumno.getNotas()) {
            suma += nota;
        }
        double notaFinal = suma / alumno.getNotas().size();
        System.out.println("La nota final de " + alumno.getNombre() + " es: " + notaFinal);
    } else {
        System.out.println("No se encontró al alumno con el nombre ingresado.");
    }
}

private Alumno buscarAlumno(String nombre) {
    for (Alumno alumno : alumnos) {
        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
            return alumno;
        }
    }
    return null;
}*/
