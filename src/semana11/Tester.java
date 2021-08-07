/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Tester {
    public static void main(String[] args) {
        int grado = 5;
       
        Estudiante beta = new Estudiante("Miguel"); 
        Estudiante alpha = new Estudiante("Sebastián");
        alpha.setGrado(grado);
        Direccion dir = new Direccion();
        dir.setPais("CR");
        dir.setProvincia("SJ");
        alpha.setDireccion(dir);
        Estudiante est3 = new Estudiante("Marvin", "Mora","Perez",120);
        
        est3.setApellido2("Rodriguez");

        System.out.println(alpha.getNombre() + " " + alpha.getLegajo());
        
        Persona pers = null;
        
        Boolean siSalimosTemprano = null;
        Float salario = null;
        Byte edad = new Byte((byte)100);
        
       
        System.out.println("Valor MAX BYTE es: "+Byte.MAX_VALUE);
        byte otra = edad.byteValue();
        double numDouble = edad.doubleValue();
        String numTxt = edad.toString();
        Integer codEmpleado = 1238;
        String codEmpTxt = codEmpleado.toString();
        String numeroCualquiera = "234";
        int ssss = Integer.parseInt(numeroCualquiera);
        ssss++;
        
        String texto;
        texto = "llkkdsfksd kj "; //autoboxing
        texto = new String("llkkdsfksd kj "); //manualmente creando objeto
        
        int orig = 5;
        Integer unaVar;
        unaVar = orig; //autoboxing
        unaVar = new Integer(orig); //manualmente creando objeto
        
        texto = null;
        orig = unaVar; //Unboxing
        orig = unaVar.intValue(); //manualmente convirtiendo a primitivo
      
    }
}
