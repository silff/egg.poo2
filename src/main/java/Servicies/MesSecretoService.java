/*El programa debe pedir al usuario que adivine el mes secreto. 
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a 
intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicies;

import Entities.MesSecreto;
import java.util.Scanner;

public class MesSecretoService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private MesSecreto mesSecreto = new MesSecreto();

    public void mostrarMesSecreto() {
        System.out.println(mesSecreto.getMesSecreto());
    }

    public void adivinar() {
        String mes;
        do {
            System.out.println("adivine el mes");
            mes = sc.next();

            if (mes.equalsIgnoreCase(mesSecreto.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("mala suerte, vuelve a intentar");
            }
        } while (!mes.equalsIgnoreCase(mesSecreto.getMesSecreto()));

    }
}
