/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado,
get y set. 
 */
package Entities;

import java.time.LocalDate;

public class Persona3 {

    String nombre;
    LocalDate fechaNacimiento;

    public Persona3() {
    }

    public Persona3(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
