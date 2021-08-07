package poo.garrobo;

import javax.swing.*;
/**
 * Interfaz con el usuario, se piden los datos que seran enviados a Garrobo, para
 * que esta los establezca como los valores de sus atributos.
 */
public class Tester{
  /**
   * Metodo controlador, el cual mediante el uso de instancias de la clase Garrobo
   * realiza pruebas para corroborar el buen funcionamiento de la misma.
   */
  public static void main(String args[]){

    /**
     * Intancia de Garrobo.
     */
    Garrobo garrobo = new Garrobo();
    Garrobo otroGarrobo = new Garrobo();
    
    
    double distanciaARecorrer;
    double tiempoDeCarrera;
    
    //Agregar los atributos
    garrobo.setNombre("Horacio");
    garrobo.setDistancia(100);
    garrobo.setTiempo(50);
    
    
    distanciaARecorrer = Double.parseDouble(JOptionPane.showInputDialog("Digite la distancia a recorrer"));
    JOptionPane.showMessageDialog(null,"Mi nombre es " + garrobo.getNombre() + ".\n Me toma " + garrobo.calcularTiempo(distanciaARecorrer)
                         + " segundos recorrer esa distancia.","Resultado",JOptionPane.INFORMATION_MESSAGE);
    
    tiempoDeCarrera = Double.parseDouble(JOptionPane.showInputDialog("Digite el tiempo a correr"));
    JOptionPane.showMessageDialog(null,"Mi nombre es " + garrobo.getNombre() + ".\n Recorro " + garrobo.calcularDistancia(tiempoDeCarrera)
                         + " metros en ese tiempo","Resultado",JOptionPane.INFORMATION_MESSAGE);
    
    
    otroGarrobo.setNombre("Pancho");
    otroGarrobo.setDistancia(750);
    otroGarrobo.setTiempo(37);
    distanciaARecorrer =  Double.parseDouble(JOptionPane.showInputDialog("Digite la distancia a recorrer"));
    JOptionPane.showMessageDialog(null,"Mi nombre es " + otroGarrobo.getNombre() + " Me toma " + otroGarrobo.calcularTiempo(distanciaARecorrer)
                         + " recorrer esa distancia","Resultado",JOptionPane.INFORMATION_MESSAGE);  
    tiempoDeCarrera = Double.parseDouble(JOptionPane.showInputDialog("Digite el tiempo a correr"));
    JOptionPane.showMessageDialog(null,"Mi nombre es " + otroGarrobo.getNombre() + " Recorro " + garrobo.calcularDistancia(tiempoDeCarrera)
                         + " en ese tiempo","Resultado",JOptionPane.INFORMATION_MESSAGE);
    /*
     * Puede modificar esta clase controladora para utilizar parametros digitados por el usuario.
     */
  }
}