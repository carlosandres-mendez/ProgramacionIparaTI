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
public class Estudiante {
    private String nombre;
    private int legajo;
    public static int grado;
    
    public Estudiante(String nombreEstudiante){
        nombre = nombreEstudiante;
    }
    
    public Estudiante(String nombreEstudiante, int valorLegajo){
        legajo = valorLegajo;
        nombre = nombreEstudiante;
    }
    
    public int getLegajo(){
        return legajo;
    }
    
    public void setLegajo(int valorLegajo){
        legajo = valorLegajo;     
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(nombre==null){
            System.out.println("Nombre invalido");
        }
        else{
            this.nombre = nombre;
        }
    }
}
