
import Servicies.FechaService;

/*

 */
public class DateMain {

    public static void main(String[] args) {
       
        FechaService fechaS = new FechaService();
       
        System.out.println(fechaS.fechaActual());
        fechaS.diferencia();
    }
    
}
