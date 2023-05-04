/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ 
para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
 */
package Entities;

public class Persona2 {

    //attrib
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;

    //constructors
    public Persona2() {
    }

    public Persona2(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //gettres y setters
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return  "nombre " + nombre + "\nedad " + edad + "\nsexo " + sexo + "\npeso " + peso + "\naltura " + altura;
    }

    
}
