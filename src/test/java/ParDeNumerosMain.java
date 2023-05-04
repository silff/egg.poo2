
import Entities.ParDeNumeros;
import Servicies.ParDeNumerosServicios;

/*
 
 */
public class ParDeNumerosMain {

    public static void main(String[] args) {
        ParDeNumerosServicios PS = new ParDeNumerosServicios();
        ParDeNumeros pdn = PS.crearPares();

        System.out.println("MOSTRAR");
        PS.mostrarValores(pdn);
        System.out.println("DEVOLVER MAYOR");
        System.out.println(PS.devolverMayor(pdn));
        System.err.println("CALCULAR POTENCIA");
        System.out.println(PS.calcularPotencia(pdn));
        System.err.println("CALCULAR RAIZ");
        System.out.println(PS.calculaRaiz(pdn));

    }

}
