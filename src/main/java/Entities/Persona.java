/*
Crea un método void que reciba un objeto tipo persona como parámetro y utilice 
el get para mostrar sus atributos. Llama ese método desde el main.
*/
package Entities;

public class Persona {
   //attrib
    String nombre;
    int edad;
    int dni;
    
    //constructor
    public Persona() {
    }

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    } 
}