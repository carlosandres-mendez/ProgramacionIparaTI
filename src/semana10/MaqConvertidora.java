/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

/**
 *
 * @author Andres
 */
public class MaqConvertidora {
    String licencia;
    
    public double convertir(Moneda origen, Moneda salida, double montoOrigin){
        double resultado = 0.0;
        
        resultado = montoOrigin/origen.getValor();
        
        return resultado;
    }
}
