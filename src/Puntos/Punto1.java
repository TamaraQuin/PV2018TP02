
package Puntos;

import java.util.Scanner;


public class Punto1 {

    private String cad;
    public Punto1() {
    }

    public String cargarCadena() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese cadena");
        setCadena(ingreso.nextLine());
        return getCadena();
    }

    public int obtenerVocales() {
        int vocales = 0;
        int i = (getCadena().length()) - 1;
        while (i >= 0) {
            if (getCadena().charAt(i) == 'a' || getCadena().charAt(i) == 'e' || getCadena().charAt(i) == 'i' || getCadena().charAt(i) == 'o' || getCadena().charAt(i) == 'u') {
                vocales = vocales + 1;
            }
            i = i - 1;
        }
        return vocales;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cad;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cad = cadena;
    }

}
