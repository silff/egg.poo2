/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole 
al usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario 
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
 */
package Servicies;

import Entities.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculasService {

    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Peliculas> listaPelis = new ArrayList();

    public void cargarPelis() {
        String opcion;
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            //p.setTitulo(sc.next());
            String titulo = sc.next();
            System.out.println("Ingrese nombre de director");
            //p.setDirector(sc.next());
            String director = sc.next();
            System.out.println("Ingrese duracion");
            //p.setDuracion(sc.nextDouble());
            double duracion = sc.nextDouble();
            listaPelis.add(new Peliculas(titulo, director, duracion));
            System.out.println("Desea seguir ingresando peliculas?(s/n)");
            opcion = sc.next().toLowerCase();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Opcion invalida, pruebe otra vez");
                System.out.println("Desa seguir ingresando peliculas?(s/n)");
                opcion = sc.next().toLowerCase();
            }
        } while (!opcion.equals("n"));

    }

    /*• Mostrar en pantalla todas las películas.*/
    public void mostrarPeliculas() {
        System.out.println("MOSTRAR LISTA");
        System.out.println(listaPelis.toString());
        System.out.println("---------------------------");
    }

    /*• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.*/
    public void mostrarPlargas() {
        System.out.println("PELICULAS DE MAS DE UNA HORA");
        ArrayList<Peliculas> pelisLargas = new ArrayList<>();
        for (Peliculas p : listaPelis) {
            if (p.getDuracion() > 1) {
                pelisLargas.add(p);
            }
        }
        System.out.println(pelisLargas.toString());
        System.out.println("---------------------------");
    }

    /*• Ordenar las películas de acuerdo a su duración (de mayor a menor) y 
    mostrarlo enpantalla.*/
    public void ordenarDuracionDesc() {
        System.out.println("ORDEN DESCENDENTE DURACION");
        Collections.sort(listaPelis, Peliculas.CompararDuracion);
        Collections.reverse(listaPelis);
        System.out.println(listaPelis.toString());
        System.out.println("---------------------------");
    }

    /*• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
    en pantalla. */
    public void ordenarDuracionAsc() {
        System.out.println("ORDEN DESCENDENTE DURACION");
        Collections.sort(listaPelis, Peliculas.CompararDuracion);
        System.out.println(listaPelis.toString());
        System.out.println("---------------------------");
    }

    /*• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.*/
    public void ordenarTitulo() {
        System.out.println("ORDENAR POR TITULO");
        Collections.sort(listaPelis, Peliculas.CompararTitulo);
        System.out.println(listaPelis.toString());
        System.out.println("---------------------------");
    }

    /*• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
    public void ordenarDirector() {
        System.out.println("ORDENAR POR DIRECTOR");
        Collections.sort(listaPelis, Peliculas.CompararDirector);
        System.out.println(listaPelis.toString());
        System.out.println("---------------------------");
    }
}
