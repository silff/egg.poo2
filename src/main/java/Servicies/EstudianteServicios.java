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
import java.util.Arrays;
import java.util.Scanner;

public class EstudianteServicios {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearEstudiante(Estudiante[] estu) {

        for (int i = 0; i < estu.length; i++) {
            System.out.println("nombre estudiante");
            String nombre = sc.next();
            System.out.println("nota");
            double nota = sc.nextDouble();
            estu[i] = new Estudiante(nombre, nota);
        }
        return estu;
    }

    public double mostrarPromedio(Estudiante[] estu) {
        double sumaNota = 0;
        for (Estudiante estu1 : estu) {
            sumaNota += estu1.getNota();
        }
        double promedio = sumaNota / estu.length;
        return promedio;
    }

    public String[] notaMayor(Estudiante[] estu) {

        double promedio = mostrarPromedio(estu);
        int cont = 0, indice = 0;
        for (Estudiante estu1 : estu) {
            if (estu1.getNota() > promedio) {
                cont++;
            }
        }
        String[] nombresMayorAlPromedio = new String[cont];

        for (Estudiante estu1 : estu) {
            if (estu1.getNota() > promedio) {
                nombresMayorAlPromedio[indice] = estu1.getNombre();
                indice++;
            }
        }
        return nombresMayorAlPromedio;
    }

    public void mostrar(String[] nombresMayorAlPromedio) {

        System.out.println("alumnos con nota mayor al promedio "
                + Arrays.toString(nombresMayorAlPromedio));

    }
}
