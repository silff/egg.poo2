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

        System.out.println("ingrese Numero de Cuenta");
        cuentaBancaria.setNumeroCuenta(sc.nextInt());
        System.out.println("ingrese DNI");
        cuentaBancaria.setDniCliente(sc.nextLong());
        System.out.println("ingrese saldo");
        cuentaBancaria.setSaldoActual(sc.nextDouble());
    }

    public void ingresar() {
        System.out.println("monto a ingresar");
        double ingreso = sc.nextDouble();
        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + ingreso);

    }

    public void retirar() {
        System.out.println("monto a retirar");
        double egreso = sc.nextDouble();

        if (cuentaBancaria.getSaldoActual() > egreso) {
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - egreso);
        } else {
            egreso = cuentaBancaria.getSaldoActual();
            cuentaBancaria.setSaldoActual(0);
        }

    }

    public void extracionRapida() {
        double extracionRapida = cuentaBancaria.getSaldoActual() * 0.2;
        String opcion;
        System.out.println("monto de extracion rapida disponible $" + extracionRapida);
        System.out.println("desea retirar?");
        opcion = sc.next();
        if (opcion.equalsIgnoreCase("SI")) {
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - extracionRapida);
        }else if (opcion.equalsIgnoreCase("NO")) {
           
        }else {
            System.out.println("debe seleccionar SI o NO");
        }

    }

    public void consultarDatos() {
        System.out.println("Numero de cuenta " + cuentaBancaria.getNumeroCuenta()
                + "\nDNI " + cuentaBancaria.getDniCliente()
                + "\nSaldo $" + cuentaBancaria.getSaldoActual());
    }
    
    public void consultarSaldo() {
        System.out.println("Saldo $" + cuentaBancaria.getSaldoActual());
    }
    
     public void menu() {
         System.out.println("MENU");
         System.out.println("A - Ingresar datos de la cuenta");
         System.out.println("B - Retiros");
         System.out.println("C - Extaccion");
         System.out.println("D - Extraccion Rapida");
         System.out.println("E - Consultar datos Cuenta");
         System.out.println("F - Consultar saldo");
         String opcion = sc.next();
         
         switch (opcion) {
             case "A": crearCuenta();
                  break;
             case "B": ingresar();
                  break;
             case "C": retirar();
                  break;
             case "D": extracionRapida();
                  break;
             case "E": consultarDatos();
                  break;
             case "F": consultarSaldo();              
                 break;
             default:
                 menu();
         }
         
     }
         
}
