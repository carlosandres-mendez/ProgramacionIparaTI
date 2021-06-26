/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class PracticaMas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        int c;
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("El valor de a: "+a);
        System.out.println("El valor de b: "+b);
    }
}
