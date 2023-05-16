
import Servicies.RazasService;


public class RazasMain {

    public static void main(String[] args) {
        
        RazasService nuevaRaza = new RazasService();
        nuevaRaza.crearLista();
        nuevaRaza.mostrarLista();
        nuevaRaza.eliminarRaza();
    }
    
}
