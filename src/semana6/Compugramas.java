/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

/**
 *
 * @author Andres
 */
public class Compugramas {
    public static void main(String[] args) {
        int z = 50;
        
        int i=0;
        while(i<z){
            System.out.print((i+1)+"\t");
            compugrama1();
            i++;
        }
    }
    
    
    public static void compugrama1(){
        int n=5;
        
        int i=1;
        while(i<=n){
            if(i==n){ //si es la ult repeticion
                System.out.print(">\t");
            }
            else{ 
                System.out.print("-\t");
            }
            i++;
        }
        System.out.println();
    }
    
    public static void ejemploImprimir(){
        System.out.println("Carlos \\ Méndez \\ Rodríguez");
        System.out.println("Mario Cordero Mora");
        System.out.println("Juliana Rivera Montoya");
        
        int a = 1;
        int b = 3;
        int c = 7;
        int d = 4;
        int f = 0;
        
        System.out.printf("%d Formatted %d output %d is %d: %d\n", a ,b, c, d, f );
    
        System.out.print(a+" Formatted "+b+" output "+c+" is "+d+": "+f);
    }
}
