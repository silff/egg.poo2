/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package Servicies;

import Entities.Razas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RazasService {

    private final Scanner sc;
    private final ArrayList<Razas> razasLista;

    public RazasService() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.razasLista = new ArrayList<>();
    }

    public void crearLista() {

        String op = "";
        while (!op.equalsIgnoreCase("n")) {
            System.out.println("Ingrese una raza: ");
            String raza = sc.next();
            razasLista.add(new Razas(raza));
            System.out.println("quiere ingresar otra? (s/n)");
            op = sc.next();
            if (op.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void mostrarLista() {
        
        System.out.println("Lista de perros: ");
        System.out.println(razasLista.toString());
        
    }

    /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
    public void eliminarRaza() {

        Iterator<Razas> it = razasLista.iterator();

        System.out.println("Ingrese la raza del perro que desea eliminar");
        String raza = sc.next();

        while (it.hasNext()) {
            
            if (it.next().getRaza().equalsIgnoreCase(raza)) {
                it.remove();
                System.out.println("La raza fue eliminada");
               
            } else {
                System.out.println("No se encontró esa raza en la lista");
            }
        }
        
        System.out.println("cantidad de razas en la lista " + razasLista.size());
        Collections.sort(razasLista,(Razas objeto1, Razas objeto2)-> objeto1.getRaza().compareTo(objeto2.getRaza()));
        mostrarLista();
    }
}

