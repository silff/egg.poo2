/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
-Método para crear cuenta pidiéndole los datos al usuario.
-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará 
al saldo actual.
-Método retirar(double): recibe una cantidad de dinero a retirar y se le restara
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicies;

import Entities.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    static Scanner sc = new Scanner(System.in);
    static CuentaBancaria cuentaBancaria = new CuentaBancaria();
    //methods

    public void crearCuenta() {

        System.out.println("ingrese dni");
        cuentaBancaria.setDniCliente(sc.nextLong());
        System.out.println("ingrese numero de cuenta");
        cuentaBancaria.setNumeroCuenta(sc.nextInt());
        System.out.println("ingrese saldo");
        cuentaBancaria.setSaldoActual(sc.nextDouble());
    }

    public double ingresar() {
        System.out.println("monto a ingresar");
        double ingreso = sc.nextDouble();
        double saldoDisponible = cuentaBancaria.getSaldoActual() + ingreso;
        return saldoDisponible;
    }

    public double retirar() {
        System.out.println("monto a retirar");
        double egreso = sc.nextDouble();
        double saldoDisp = cuentaBancaria.getSaldoActual() + egreso;
        return saldoDisp;
    }

}
