
package Puntos;


public class Punto2 {
    private String cadena;

    public String cargarCad() {
        Punto2 ingreso = new Punto2();
        setCadena(ingreso.cargarCadena());
        return getCadena();
    }

    public void invertirCad() {
        String cadenainv = "";
        int i = getCadena().length() - 1;
        while (i >= 0) {
            cadenainv = cadenainv + getCadena().charAt(i);
            i = i - 1;
        }
        System.out.println(cadenainv);

    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    

    private String cargarCadena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCadena(String cargarCadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


