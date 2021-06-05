/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author Andres
 */
public class Metodos {

    
    /**
     * Este metodo calcula la suma de dos numeros 
     * @param numero1
     * @param numero2
     * @return retorna un numero entero int
     */
    public static int sumar(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
    }    
    
    /**
     * Este metodo calcula una suma de dos numeros de tipo float
     * @param numero1
     * @param numero2
     * @return 
     */
    public static float sumar(float numero1, float numero2){
        float resultado;
        resultado = numero1 + numero2;
        return resultado;
    }
    
    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static int mutiplicar(int numero1, int numero2){
        int resultado;
        resultado = numero1 * numero2;
        return resultado;
    }
    
    /**
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @return
     */
    public static int mutiplicar(int numero1, int numero2,  int numero3){
        int resultado;
        resultado = numero1 * numero2 * numero3;
        return resultado;
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        int salarioBase = 1231231;
        int bonoVentas = 2343453;
        
        float resultadoParaJefe;
        
        resultadoParaJefe = sumar(salarioBase,bonoVentas);
        
        System.out.println(resultadoParaJefe);        
    }
}
