
import Servicies.PeliculasService;

public class PeliculasMain {

    public static void main(String[] args) {
        PeliculasService peliS = new PeliculasService();
        peliS.cargarPelis();
        peliS.mostrarPeliculas();
        peliS.mostrarPlargas();
        peliS.ordenarDuracionDesc();
        peliS.ordenarDuracionAsc();
        peliS.ordenarTitulo();
        peliS.ordenarDirector();
    }
}
