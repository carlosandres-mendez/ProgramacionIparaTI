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
    static int iva = 100;
    
    /**
     * Este metodo calcula la suma de dos numeros 
     * @param numero1
     * @param numero2
     * @return retorna un numero entero int
     */
    public static long sumar(long numero1, long numero2){
        long resultado;
        resultado = numero1 + numero2 + iva;
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
        resultado = numero1 + numero2 + iva;
        return resultado;
    }
    
    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static long multiplicar(long numero1, long numero2){
        long resultado;
        long mult = numero1 * numero2;
        resultado = sumar(mult,iva);
        return resultado;
    }
    
    /**
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @return
     */
    public static int multiplicar(int numero1, int numero2,  int numero3){
        int resultado;
        resultado = (numero1 * numero2 * numero3) + iva;
        return resultado;
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        long salarioBase = 1231231;
        long bonoVentas = 2343453;
        
        long resultadoParaJefe;
        
        resultadoParaJefe = multiplicar(salarioBase,bonoVentas);
        
        System.out.println(resultadoParaJefe);        
    }
}
