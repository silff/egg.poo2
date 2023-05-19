
import Servicies.PeliculasService;

public class PeliculasMain {

    public static void main(String[] args) {
        PeliculasService peliS = new PeliculasService();
        peliS.cargarPelis();
        peliS.MostrarPeliculas();
    }
}
