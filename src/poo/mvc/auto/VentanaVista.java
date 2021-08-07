package poo.mvc.auto;

/*
 * VISUALIZADOR: Clase que maneja metodos de entrada salida de la clase Ventana
 * */

import javax.swing.JOptionPane;

public class VentanaVista extends JOptionPane {

    Ventana v;                      //objeto local usado para ingresar / mostrar datos de la Ventana

    public VentanaVista(Ventana vv) {  //mapeo del objeto local con el objeto que maneja el Modelo
        v = vv;
    }

    public int definaTamano() {
        return Integer.parseInt(this.showInputDialog("Tamano en cm de la ventana?"));
    }

    public void showEstadoNum() {
        float razon;
        razon = (float) v.getEstadoNum() / v.getAltura() * 100;
        this.showMessageDialog(null, "La ventana tiene un: " + razon + " % cerrada");
    }
}
