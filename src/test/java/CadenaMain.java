
import Entities.Cadena;
import Servicies.CadenaService;


public class CadenaMain {

    public static void main(String[] args) {
       
        CadenaService cadenaS = new CadenaService();
        Cadena frase = new Cadena("hola mundo");
        cadenaS.mostrarVocales(frase);
    }
    
}
