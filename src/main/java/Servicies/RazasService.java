/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package Servicies;

import Entities.Razas;
import java.util.ArrayList;
import java.util.Scanner;

public class RazasService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Razas> razasLista = new ArrayList<>();

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

        System.out.println("Lista de perros: ");

        System.out.println(razasLista.toString());

    }
}
/*   private Scanner leer;
    private ArrayList<Perro> listasPerros;

    public PerroServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listasPerros = new ArrayList<>();
    }

    public void cargarPerros() {
        String salir = " ";

        do
        {
            System.out.println("Ingrese la raza del perro: ");
            String razaPerro = leer.next();
            listasPerros.add(new Perro(razaPerro));

            System.out.println("Quiere cargar otro perro? N/ para salir");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("N"));

    }
private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }*/
