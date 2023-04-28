
import Entities.Fracciones;
import Servicies.FraccionesServicios;
import java.util.Scanner;


public class FraccionesMain {

    public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in).useDelimiter("\n");

        FraccionesServicios miFraccionServicio = new FraccionesServicios();
        Fracciones miFraccion = miFraccionServicio.crearObjeto();

        int opcion;
        do {
            System.out.println("Ingrese la operación a realizar");
            System.out.println("");
            System.out.println("1- Suma.");
            System.out.println("2- Resta.");
            System.out.println("3- Multiplicación.");
            System.out.println("4- División.");
            System.out.println("5-Salir");
            System.out.println("");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    miFraccionServicio.sumarFraccion(miFraccion);
                    break;

                case 2:
                    miFraccionServicio.restarFraccion(miFraccion);
                    break;
                case 3:
                    miFraccionServicio.multiplicarFraccion(miFraccion);
                    break;

                case 4:
                    miFraccionServicio.dividirFraccion(miFraccion);
                    break;
                case 5:
                    System.out.println("bye bye");
                    break;

            }

        } while (opcion != 5);

    }

}
    
