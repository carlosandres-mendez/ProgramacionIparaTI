/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Quiz1v2 {
    public static void main(String[] args) {
        String nombreIngrediente1 = "pereroni";
        String nombreIngrediente2 = "jamon";
        String nombreIngrediente3 = "piña";
        
        double precioIngrediente1 = 200.0d;
        double precioIngrediente2 = 300.0d;
        double precioIngrediente3 = 170.0d;
        
        boolean indIngrediente1 = false;
        boolean indIngrediente2 = false;
        boolean indIngrediente3 = false;
        int tamano = 0; //0 prederminada pequena, 1 grande
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite true para Si, false para No");
        System.out.println("Desea "+nombreIngrediente1+"?");
        indIngrediente1 = s.nextBoolean();
        
        System.out.println("Digite true para Si, false para No");
        System.out.println("Desea "+nombreIngrediente2+"?");
        indIngrediente2 = s.nextBoolean();
        
        System.out.println("Digite true para Si, false para No");
        System.out.println("Desea "+nombreIngrediente3+"?");
        indIngrediente3 = s.nextBoolean();
        
        System.out.println("Digite 1 para grande, 0 para pequeña");
        tamano = s.nextInt();
        
        double pagoTotal=0.0d;
        double pagoFinal=0.0d;
        
        if(indIngrediente1==true){
            pagoTotal = precioIngrediente1;
        }
        if(indIngrediente2==true){
            pagoTotal = pagoTotal + precioIngrediente2;
        }
        if(indIngrediente3==true){
            pagoTotal = pagoTotal + precioIngrediente3;
        }
        
        if(tamano==0){
            pagoFinal = pagoTotal + (pagoTotal*0.1);
        }
        else if(tamano==1){
            pagoFinal = pagoTotal + (pagoTotal*0.4);
        }
        else{
           System.out.println("Selecciono un tamaño invalido."); 
        }
        
        imprimirFactura(pagoFinal,indIngrediente1,indIngrediente2,indIngrediente3,
                nombreIngrediente1,nombreIngrediente2,nombreIngrediente3,tamano);
    }
    
    public static void imprimirFactura(
            double pagoFinal, 
            boolean indIngrediente1, 
            boolean indIngrediente2,
            boolean indIngrediente3,
            String nombreIngrediente1,
            String nombreIngrediente2,
            String nombreIngrediente3,
            int tamano){
        System.out.println("Precio a pagar: "+pagoFinal);
        
        if(indIngrediente1==true){
            System.out.println(nombreIngrediente1);
        }
        if(indIngrediente2==true){
            System.out.println(nombreIngrediente2);
        }
        if(indIngrediente3==true){
            System.out.println(nombreIngrediente3);
        }
        
        if(tamano==0){
            System.out.println("Pequeña");
        }
        else{
            System.out.println("Grande");
        }
    }
}
