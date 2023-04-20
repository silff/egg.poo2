

import Servicies.CuentaBancariaServicio;
import Entities.CuentaBancaria;

public class CuentaBancariaMain {

    public static void main(String[] args) {
       
        CuentaBancariaServicio nuevaC = new CuentaBancariaServicio();
        nuevaC.crearCuenta();
        System.out.println(nuevaC);
    }
    
}
