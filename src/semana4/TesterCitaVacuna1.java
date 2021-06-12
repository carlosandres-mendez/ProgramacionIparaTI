/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author Andres
 */
public class TesterCitaVacuna1 {
    public static void main(String[] args) {
        SolucionCitaVacuna1 solucion = new SolucionCitaVacuna1();
        
        short nFactores = 1;
        String mensaje;
                
        mensaje = solucion.obtenerCitaVacuna(nFactores);
        
        System.out.println(mensaje);
    }
}
