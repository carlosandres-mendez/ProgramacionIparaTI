/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author Andres
 */
public class TesterArreglos {
    public static void main(String[] args) {
        //Arreglos arreglos = new Arreglos();
        //arreglos.llenarArreglo();
        //System.out.println(arreglos.imprimirArreglo());
        
        ArreglosConPrimos a = new ArreglosConPrimos();
        a.setTamanho(25);
        a.solicitarDatosUsuario();
        System.out.println(a.imprimirArreglo());
    }
}
