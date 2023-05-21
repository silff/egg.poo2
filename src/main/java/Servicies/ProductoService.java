/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar
su precio, eliminar un producto y mostrar los productos que tenemos con su precio 
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor 
el precio. Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package Servicies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    private final Scanner sc;
    private final Map<String, Double> productos;

    public ProductoService() {
        this.sc = new Scanner(System.in);
        this.productos = new HashMap<>();
    }

    public void crearProductos() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.next();
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        productos.put(nombre, precio);
        System.out.println("Producto agregado");
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto para modificar el precio");
        String nombre = sc.next();
        if (!productos.containsKey(nombre)) {
            System.out.println("Producto no encontrado");
            return;
        }
        System.out.println("Ingrese el nuevo precio del producto");
        double precio = sc.nextDouble();
        productos.put(nombre, precio);
        System.out.println("Precio modificado");
    }

    public void renombrarProducto() {
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombreViejo = sc.next();
        if (!productos.containsKey(nombreViejo)) {
            System.out.println("Producto no encontrado");
        } else {
            System.out.println("Ingrese el nuevo nombre");
            String nuevoNombre = sc.next();
            Double value = productos.remove(nombreViejo);
            productos.put(nuevoNombre, value);
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = sc.next();
        if (!productos.containsKey(nombre)) {
            System.out.println("Producto no encontrado");
            return;
        }
        productos.remove(nombre);
        System.out.println("Producto eliminado");
    }

    public void listaProductos() {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " $" + entry.getValue());
        }
    }

    public void salir() {
    }

    public void menu() {
        System.out.println("""
                           MENU
                           A - Ingresar producto
                           B - Renombrar producto
                           C - Modificar precio
                           D - Eliminar producto
                           E - Lista productos
                           F - Salir""");
        String opcion = sc.next();

        switch (opcion.toUpperCase()) {
            case "A" -> {
                crearProductos();
                menu();
            }
            case "B" -> {
                renombrarProducto();
                menu();
            }
            case "C" -> {
                modificarPrecio();
                menu();
            }
            case "D" -> {
                eliminarProducto();
                menu();
            }
            case "E" -> {
                listaProductos();
                menu();
            }
            case "F" ->
                salir();
            default -> {
            }
        }
    }
}
