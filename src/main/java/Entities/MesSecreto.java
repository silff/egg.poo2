/*Crea una clase en Java donde declares una variable de tipo array de Strings que 
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, 
mesSecreto = mes[9].
 */
package Entities;

public class MesSecreto {

    private final String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
        "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[(int) (Math.random() * 11)];

    public MesSecreto() {
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
