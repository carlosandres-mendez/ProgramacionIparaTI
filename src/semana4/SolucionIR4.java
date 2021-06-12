/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author Andres
 */
public class SolucionIR4 {
    public double calcularImpuesto(int numDependientes, double salario){
        double resultado;
        resultado = calcularSalario(salario);
   
        resultado = calcularDependientes(numDependientes,resultado);
        
        return resultado;
    }
    
    private double calcularSalario(double salario){
        double resultado;
        
        if(salario<200000){
            resultado = 0;
        }
        else if(salario < 400000){
            resultado = salario*0.1;
        }
        else if(salario < 600000){
            resultado = salario*0.15;
        }
        else if(salario < 800000){
            resultado = salario*0.2;
        }
        else {
            resultado = salario*0.3;
        } 
        return resultado;
    }
    
    private double calcularDependientes(int numDependientes, double salario){
        double resultado;
        if(numDependientes==1){
            resultado = salario*1;
        }
        else if(numDependientes==2){
            resultado = salario*0.9;
        }
        else if(numDependientes==3){
            resultado = salario*0.7;
        }
        else if(numDependientes==4){
            resultado = salario*0.6;
        }
        else{
            resultado = salario*0.4;
        }
        return resultado;
    }
}
