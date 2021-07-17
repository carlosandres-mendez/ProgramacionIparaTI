/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author Andres
 */
public class Repaso {
    double salario=10d;
    
    public double calcularImpuesto(int numDependiente, double salario, double taza){
        double retorno = -1;
        
        retorno = salario * taza;
        retorno = retorno/numDependiente;
      
        return retorno;
    }
    
    public void calcularImpuesto(){
            //System.out.println(salario);
    }
    
}
