
import Servicies.PaisService;

public class PaisMain {

    public static void main(String[] args) {
        
        PaisService pS = new PaisService();
        pS.crearPaises();
        pS.mostrarLista();
        //pS.ordenarAlfabeticamente();
        pS.borrarPais();
    }
    
}
