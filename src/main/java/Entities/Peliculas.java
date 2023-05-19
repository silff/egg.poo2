/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
Para esto, tendremos una clase Pelicula con el título, director y duración de la 
película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta 
lo que se pide a continuación:
 */
package Entities;

import java.util.Comparator;

public class Peliculas {

    private String titulo;
    private String director;
    private double duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return """ 
               titulo """ + " " + titulo + ", director=" + director + ", duracion=" + duracion;
    }
    }

    /*public static Comparator<Peliculas> CompararDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
           return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator<Peliculas> CompararTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Peliculas> CompararDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
*/

