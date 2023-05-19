/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole 
al usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario 
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:


• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicies;

import Entities.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculasService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Peliculas p = new Peliculas();
    ArrayList<Peliculas> listaPelis = new ArrayList();

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
            System.out.println("Desea seguir ingresando peliculas?(si.no)");
            opcion = sc.next().toLowerCase();
            while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no")) {
                System.out.println("Opcion invalida, pruebe otra vez");
                System.out.println("Desa seguir ingresando peliculas?(si.no)");
                opcion = sc.next().toLowerCase();
            }
        } while (!opcion.equals("no"));

    }
    /*• Mostrar en pantalla todas las películas.*/
    public void MostrarPeliculas() {
        
            System.out.println(listaPelis.toString());
       
    }
    
    /*• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.*/
}
/*
*/