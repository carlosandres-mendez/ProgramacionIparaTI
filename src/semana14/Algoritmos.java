/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana14;

/**
 *
 * @author Andres
 */
public class Algoritmos {
    public static void main(String[] args) {
        int[] arreglo = {2,8,5,3,9,4,1};
        /*
        for(int k=0;k<arreglo.length-1;k++){
        
            for(int u=0;u<arreglo.length-k-1;u++){
                if(arreglo[u] > arreglo[u+1]){
                    int temp = arreglo[u+1];
                    arreglo[u+1] = arreglo[u];
                    arreglo[u] = temp;
                }
            }
        
        }*/
        
        for(int k=1;k<arreglo.length;k++){
            
            for(int u=k;u>0;u--){
                if(arreglo[u-1] > arreglo[u]){
                    int temp = arreglo[u-1];
                    arreglo[u-1] = arreglo[u];
                    arreglo[u] = temp;
                }
            }
        
        }
        // otra implementacion 
        // https://www.geeksforgeeks.org/insertion-sort/
        
        //int target = 4;
        
        
        System.out.print("|");
        for(int u=0;u<arreglo.length;u++){
            System.out.print(arreglo[u]+"|");
        }
    }
}
