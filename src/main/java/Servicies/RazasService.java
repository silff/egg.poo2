/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package Servicies;

import java.util.ArrayList;
import java.util.Scanner;

public class RazasService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearLista() {

        ArrayList<String> raza = new ArrayList<>();

        String op = "";
        while (!op.equalsIgnoreCase("n")) {
            System.out.println("Ingrese una raza: ");

            raza.add(sc.next());
            System.out.println("quiere ingresar otra? (s/n)");
            op = sc.next();
            if (op.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Lista de perros: ");
        
            System.out.println(raza.toString());
        
    }
}
