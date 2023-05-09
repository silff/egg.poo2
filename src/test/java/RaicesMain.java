
import Entities.Raices;
import Servicies.RaicesServicio;


public class RaicesMain {

    
    public static void main(String[] args) {
        
        RaicesServicio raiz = new RaicesServicio();
        Raices r = new Raices(3, -5, 2);
        raiz.calcular(r);
    }
    
}
