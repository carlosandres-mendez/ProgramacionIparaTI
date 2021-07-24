/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Tester {
    public static void main(String[] args) {

       
        Estudiante beta = new Estudiante("Miguel"); 
        Estudiante alpha = new Estudiante("Sebastián", 7);
        Estudiante est3 = new Estudiante("Marvin", 120);
        
        Estudiante.grado = 10;
        beta.setLegajo(5);
        beta.setNombre(null);
        //beta.nombre = null;
        //beta.legajo = 89879;
        
        //alpha.setGrado(70);
        Estudiante.grado = 70;
        
        System.out.println(Estudiante.grado);

        
        System.out.println(alpha.getNombre() + " " + alpha.getLegajo());
        
        
     /*   beta.setLegajo(5);
        beta.setNombre("Miguel");
        
        alpha.setLegajo(7);
        alpha.setNombre("Sebastián");

        est3.setLegajo(120);
        est3.setNombre("Marvin");
        */
    }
}
