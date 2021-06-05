/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Calculadora {
    
    public float promedio(int a, int b){
        float resultado;
        
        resultado = a + b;
        resultado = resultado / 2;
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int num1;
        int num2;
        float resultado;
        
        Scanner f23frr = new Scanner(System.in);
        System.out.println("Favor digite un número: ");
        num1 = f23frr.nextInt();
        System.out.println("Favor digite otro número: ");
        num2 = f23frr.nextInt();
        
        Calculadora calc = new Calculadora();
        resultado = calc.promedio(num1, num2);
        System.out.println("Resultado es: "+resultado); 
    }
}
