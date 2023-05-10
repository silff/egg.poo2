/*Crear una clase CadenaServicio
en el paquete servicios que implemente los siguientes métodos:

Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicies;

import Entities.Cadena;
import java.util.Scanner;

public class CadenaService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
    frase ingresada.*/
    public void mostrarVocales(Cadena cadena) {
        int count = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char c = cadena.getFrase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count + "cantidad de vocales: ");
    }

}
