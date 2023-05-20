/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entities;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Double> notas;

    public Alumno() {
        this.nombre = "";
        this.notas = new ArrayList<>();
    }

    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return """
               
               nombre  """ + " " + nombre + ", notas " + notas;
    }

}
