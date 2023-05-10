/*Crear una clase CadenaServicio
en el paquete servicios que implemente los siguientes métodos:
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
            char c = cadena.getFrase().toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("cantidad de vocales: " + count);
    }

    /* Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
    pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        String fraseInvertida = sb.reverse().toString();
        System.out.println(fraseInvertida);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
    usuario y contabilizar cuántas veces se repite el carácter en la frase, por 
    ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
    public void vecesRepetido(Cadena cadena) {
        System.out.println("ingrese un caracter a buscar");
        char caracter = sc.next().charAt(0);
        char c = Character.toLowerCase(caracter);
        int cont = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().toLowerCase().charAt(i) == c) {
                cont++;
            }
        }
        System.out.println("el caracter " + caracter + " se encuentra repetido " + cont + " veces");

    }

    /* Método compararLongitud(String frase), deberá comparar la longitud de la 
    frase que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena cadena) {
        System.out.println("ingrese otra frase");
        String frase = sc.next();
        if (cadena.getLongitud() == frase.length()) {
            System.out.println("las frases tienen la misma longitud");
        } else {
            System.out.println("las frases NO tienen la misma longitud");
        }

    }

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase 
    Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante. */
    public void unirFrases(Cadena cadena) {
        System.out.println("ingrese otra frase para unir");
        String frase = sc.next();
        System.out.println("frase unida \n"
                + cadena.getFrase().concat(" " + frase));
    }

    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
    que se encuentren en la frase, por algún otro carácter seleccionado por el 
    usuario y mostrar la frase resultante.*/
    public void reemplazar(Cadena cadena) {
        System.out.println("reemplace la 'a' por otro carater");
        String caracter = sc.next();
        String nuevaCadena = cadena.getFrase().replace("a", caracter);
        System.out.println("frase con caracter reemplazado \n"
                + nuevaCadena);
    }
    
    /*Método contiene(String letra), deberá comprobar si la frase contiene una
    letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public boolean contiene(Cadena cadena) {
        System.out.println("ingrese una letra a buscar");
        String letra = sc.next();
        boolean tiene;
        if ( cadena.getFrase().contains(letra)) {
            tiene = true;
        }else {
            tiene = false;
        }
       
        return tiene;
    }
}
