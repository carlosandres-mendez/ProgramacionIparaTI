/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        
        if(args==null || args.length==0){
            System.out.println("Debe digitar 1 Terminal 2 Interfaz Gráfica");
        }
        else{
            if(args[0].equals("1")){
                porTerminal();
            }
            else{
                conGUI(args[3]);
            }
        }

    }
    
    public static void porTerminal(){
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
    
    public static void conGUI(String nombreUsuario){
        int num1;
        int num2;
        float resultado;
       
        String num1Texto = JOptionPane.showInputDialog(null, "Estimado "+nombreUsuario+"Favor digite un número: ");
        
        num1 = Integer.parseInt(num1Texto);
        
        String num2Texto = JOptionPane.showInputDialog(null, "Favor digite otro número: ");
        
        num2 = Integer.parseInt(num2Texto);
        
        Calculadora calc = new Calculadora();
        resultado = calc.promedio(num1, num2);

        JOptionPane.showMessageDialog(null,"Resultado es: "+resultado);
    }
}
