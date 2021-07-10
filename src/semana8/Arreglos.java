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
public class Arreglos {
    public static void main(String[] args) {
        int[] arreglo = {2,5,8,1,0};
        
        int n = arreglo.length;
        
        for(int i=0;  i <= n-1  ;i++){
            
            System.out.println(arreglo[i]);
        }
        
        for(int i=n-1;  i >= 0  ;i--){
            
            //System.out.println(arreglo[i]);
        }  
        
        
        boolean[] booleanos;
        
        booleanos = new boolean[100];
        
        n = booleanos.length;
        for(int i=0;  i <= n-1  ;i++){
            
            booleanos[i] = true;
        }
        
        
        
        n = booleanos.length;
        for(int i=0;  i <= n-1  ;i++){
            
            //System.out.println(booleanos[i]);
        }
        
        /*int 0
        flout 0.0f
        double 0.0d
        boolean false
        */
        
       
        int[] numeros;
        
        numeros = new int[100];
        
        n = numeros.length;
        for(int i=0;  i <= n-1  ;i++){
            
            numeros[i] = n-i-1;
        }
        
        n = numeros.length;
        for(int i=0;  i <= n-1  ;i++){
            
            System.out.println(numeros[i]);
        }
        
    }
}
