/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

/**
 *
 * @author Andres
 */
public class Practica {
    public static void main(String[] args) {
        int numero=0;
        
        //**** PER ******
        Persona per;
        per = new Persona(new String("Juan"), new String("Mora"), new String("Rojas"));

        per.direccion = new Direccion("Uruguay","Sj");
        per.setDireccion(new Direccion("CR","Sj"));
        per.setNombre(new String("   "));
        


        
        //**** PER2 *****
        Persona per2=new Persona(new String("Juan"), new String("Mora"), new String("Rojas"));
        
        per2.direccion = new Direccion("Uruguay","Sj");
        per2.setDireccion(new Direccion("CR","Sj"));
        per2.setNombre(new String("   "));
        
        otroMetodo(per);
        otroMetodo(numero);
        
        //IMPRIMIMOS 
        System.out.println("La info del objeto per es: "+per);
        System.out.println("La info del variable numero es: "+numero);
        
        System.out.println(per.nombre);
        System.out.println(per.apellido1);
        
        System.out.println(per.getNombre());
        System.out.println(per.getApellido1());
        System.out.println(per.getPeso());
        
        if((per.getNombre()!=null && per.getNombre().equals(per2.getNombre())
               || per.getNombre()==null && per2.getNombre()==null)
                &&
            (per.getApellido1()!=null &&per.getApellido1().equals(per2.getApellido1())
               || per.getApellido1()==null && per2.getApellido1()==null)   
                &&
            (per.getApellido2()!=null &&per.getApellido2().equals(per2.getApellido2())
               || per.getApellido2()==null && per2.getApellido2()==null)
                ){
            System.out.println("si son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
        
        if(per.getNombre().equals(per2.getNombre())
                && per.getApellido1().equals(per2.getApellido1())
                && per.getApellido2().equals(per2.getApellido2())){
            System.out.println("si son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
        
       
        if(per.equals(per2)){
            System.out.println("probando equals: si son iguales");
        }
        else{
            System.out.println("probando equals: no son iguales");
        }
        
 

    }
    
    public static void otroMetodo(Persona obj){
        Persona otraPersona = new Persona(null,null,null);
        obj.nombre = "Maria";
    }
    
    public static void otroMetodo(int numero){
        numero = 50;
    }
}
