package Servicies;

import Entities.Curso;

import java.util.Scanner;

public class CursoServicios {

    private Scanner sc = new Scanner(System.in);
    private Curso curso = new Curso();

    /*Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
    alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta 
    información en un arreglo e iterar con un bucle, solicitando en cada repetición 
    que se ingrese el nombre de cada alumno.*/
    public String[] cargarAlumnos() {
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("alumno " + (i + 1));
            curso.getAlumnos()[i] = sc.next();
        }
        return curso.getAlumnos();
    }

    public void mostrarAlumnos() {
        System.out.println(curso.toString());
    }

    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos 
    al usuario y después se le asignan a sus respectivos atributos para llenar el 
    objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle 
    valor al atributo alumnos*/
    public void crearCurso() {
        System.out.println("ingrese nombre del curso");
        curso.setNombreCurso(sc.next());
        System.out.println("ingrese cantidad horas por dia");
        curso.setCantidadHorasPorDia(sc.nextDouble());
        System.out.println("ingrese cantidad de dias por semana");
        curso.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("ingrese turno M/T");
        curso.setTurno(sc.next());
        System.out.println("ingrese precio por hora");
        curso.setPrecio(sc.nextDouble());

    }

    /*Método calcularGananciaSemanal(): este método se encarga de calcular la 
    ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
    de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de 
    días a la semana que se repite el encuentro.*/
    public void calcularGananciaSemanal() {
        double ganaciaSemanal = curso.getCantidadHorasPorDia()
                * curso.getCantidadDiasPorSemana() * curso.getPrecio();
        System.out.println("Ganancia semanal x alumno $" + ganaciaSemanal);
        System.out.println("Ganancia total $ " + ganaciaSemanal * curso.getAlumnos().length);
    }

}
