/*
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese 
el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al 
atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día,
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
se repite el encuentro.
 */
package Servicies;

import Entities.Curso;
import java.util.Scanner;

public class CursoServicios {

    Scanner sc = new Scanner(System.in);

    public CursoServicios(Curso curso) {
        System.out.println("ingrese nombre del curso");
        curso.setNombreCurso(sc.next());
        System.out.println("ingrese cantidad horas por dia");
        curso.setCantidadHorasPorDia(sc.nextDouble());
        System.out.println("ingrese cantidad de dias por semana");
        curso.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("ingrese turno");
        curso.setTurno(sc.next());
        System.out.println("ingrese precio");
        curso.setPrecio(sc.nextDouble());
        System.out.println("ingrese alumnos");
        for (int i = 0; i < curso.setAlumnos().length; i++) {
            
        }
    }

}
