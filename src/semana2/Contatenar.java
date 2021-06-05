/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Contatenar {
    public static void main(String[] args){
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Universidad Latina de Costa Rica");
        System.out.println("Facultad TICs");
        System.out.println("Programación para TI");
        System.out.println();
        System.out.println("Por favor, digite un número: ");

        int num2 = escaner.nextInt();
        System.out.println("Por favor, digite otro número: ");

        int box1 = escaner.nextInt();

        System.out.print("Resultado: ");
        String nombre = "Carlos Méndez";
        
        //Ojo a esta forma, aqui declaramos una variable, pero se puede no usar
        //String resultado = nombre + " " + num2 + " " + box1;
        //System.out.println(resultado);
        
        System.out.println(nombre + " " + num2 + " " + box1);
        

    }
}
