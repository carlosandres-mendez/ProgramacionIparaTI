/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author Andres
 */
public class Compugramas {
    public static void main(String[] args) {
        compugrama2();
    }
    
    public static void compugrama1() {
        int n=20;
        
        for(int i=0;i < n;i++){
            System.out.print("*");
        }
        
        System.out.println();
        
        for(int i=0;i < (n-1);i++){
            if(i < (n-2))
                System.out.println("*");
            else
               System.out.print("*"); 
        }
        
        for(int i=0;i < (n-1);i++){
            System.out.print("*");
        }
    }
    
    public static void compugrama2() {
        int n=7;
        
        for(int i=0;i < n;i++){
            
            for(int j=0;j < n;j++){
                if(i==0 || i==(n-1) || j==0 || j==(n-1) || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        

    }
}
