/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
package Servicies;

import Entities.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PaisService {

    private final Scanner sc;
    private final Set<Pais> paises;

    public PaisService() {
        this.sc = new Scanner(System.in);
        this.paises = new HashSet<>();
    }

    public void crearPaises() {
        String opcion;
        do {
            Pais pais = new Pais();
            System.out.println("Ingrese el pais");
            pais.setPais(sc.next());

            paises.add(pais);
            System.out.println("Desea ingresar otro?(s/n)");
            opcion = sc.next().toLowerCase();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Opcion invalida, pruebe otra vez");
                System.out.println("Desa ingresar otro?(s/n)");
                opcion = sc.next().toLowerCase();
            }
        } while (!opcion.equals("n"));
    }

    public void mostrarLista() {
        System.out.println("Lista de Paises");
        System.out.println(paises.toString());
    }

    /*Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto 
    recordar cómo se ordena un conjunto.*/
    public void ordenarAlfabeticamente() {
        System.out.println("Lista ordenada");
        List<Pais> listaPaises = new ArrayList<>(paises);
        Collections.sort(listaPaises, (Pais objeto1, Pais objeto2) -> {
            return objeto1.getPais().compareTo(objeto2.getPais());
        });
        System.out.println(listaPaises.toString());
    }

    /*Por último, al usuario se le pedirá un país y se recorrerá el conjunto con 
    un Iterator, se buscará el país en el conjunto y si está en el conjunto se 
    eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país 
    no se encuentra en el conjunto se le informará al usuario. */
    public void borrarPais() {
        Iterator<Pais> it = paises.iterator();
        System.out.println("ingrese el pais que quiere eliminar");
        String nombre = sc.next();
        boolean encontrado = false;
        while (it.hasNext()) {

            if (it.next().getPais().equalsIgnoreCase(nombre)) {
                it.remove();
                encontrado = true;
            }
        }

        if (encontrado == true) {
            System.out.println("Pais eliminado" + " - " + nombre.toUpperCase());

        } else {
            System.out.println("No se encontró el pais");
        }
        mostrarLista();
    }

}
