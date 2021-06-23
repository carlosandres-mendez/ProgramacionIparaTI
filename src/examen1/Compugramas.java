/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author carlosandres.mendez
 */
public class Compugramas {

    public void rectanguloHueco(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n) {
                    System.out.print("*\t");
                } else {
                    
                    if(i==1 || i==n)
                        System.out.print("*\t");
                    else
                        System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
    
    public void rectanguloBachSlash(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n) {
                    System.out.print("*\t");
                } else {
                    
                    if(i==1 || i==n)
                        System.out.print("*\t");
                    else{
                        
                        if(j==i)
                            System.out.print("*\t");
                        else
                            System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }
    }   
    
    public void rectanguloSlash(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n) {
                    System.out.print("*\t");
                } else {
                    
                    if(i==1 || i==n)
                        System.out.print("*\t");
                    else{
                        
                        if(i==(n-j))
                            System.out.print("*\t");
                        else
                            System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }
    }    
    
    public void rectanguloX(int n) {

        for (int j = 1; j <= n; j++) {

            for (int i = 1; i <= n; i++) {
                if (j==1 || j==n) {
                    System.out.print("*\t");
                } else {
                    
                    if(i==1 || i==n)
                        System.out.print("*\t");
                    else{
                        
                        if(j==i || i==(n-j))
                            System.out.print("*\t");
                        else
                            System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }
    }     
}
