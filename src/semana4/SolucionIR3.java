/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 * No es una practica aceptada en JAVA
 * @author Andres
 */
public class SolucionIR3 {
    public double calcularImpuesto(int numDependientes, double salario){
        double montoDependiente;
        
        if(numDependientes==1){
            
            montoDependiente = salario*1;
        }
        else if(numDependientes==2){
            montoDependiente = salario*0.9;
        }
        else if(numDependientes==3){
            montoDependiente = salario*0.7;
        }
        else if(numDependientes==4){
            montoDependiente = salario*0.6;
        }
        else{
            montoDependiente = salario*0.4;
        }
        
        if(salario<200000){
            return 0;
        }
        else if(salario < 400000){
            return montoDependiente*0.1;
        }
        else if(salario < 600000){
            return montoDependiente*0.15;
        }
        else if(salario < 800000){
            return montoDependiente*0.2;
        }
        else {
            return montoDependiente*0.3;
        } 
    }
}
