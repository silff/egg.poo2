
import Entities.NIF;
import Servicies.NIFService;

public class NIFMain {

    public static void main(String[] args) {

        NIFService nifS = new NIFService();
        NIF nif = new NIF();
        nifS.crearNIF(nif);
        nifS.mostrar(nif);

    }

}
