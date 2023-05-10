
import Servicies.ArregloService;

/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B 
de 20 números reales. 
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
public class ArregloMain {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        ArregloService arr = new ArregloService();
        arr.inicializarA(A);
        arr.mostrarA(A);
        arr.ordenar(A);
        arr.inicializarB(A, B);
        arr.mostrarA(A);
        arr.mostrarA(B);

    }

}
