/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

/**
 *
 * @author Andres
 */
public class Casting {
    public static void main(String[] args) {
        int a = 50000;
        short b = 32767;
        
        System.out.println("Valor a = "+a);
        System.out.println("Valor b = "+b);
        
       
         b = (short)a;
        
        System.out.println("Valor a = "+b);
        
    }
}
