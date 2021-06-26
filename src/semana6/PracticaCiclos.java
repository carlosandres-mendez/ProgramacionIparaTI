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
public class PracticaCiclos {
    public static void main(String[] args) {
        int i=5000;
        
        
        int n = 0;
        for(i=5; i > n; --i){
            System.out.println(i);
        }
        
        i=5;
        while(i > n){
            System.out.println(i);
            --i;
        }
        
        
        i=5;
        do{
          System.out.println(i);
           --i; 
        } while(i > n);
        
        
        
        int z = 0;
        int x = z;
        z = z + 1;
        System.out.println("El valor de x es: "+x);
        
        
        
        
        
        
    }
}
