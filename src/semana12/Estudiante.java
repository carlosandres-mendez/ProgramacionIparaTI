/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

import semana11.*; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class Estudiante extends Persona {
    private int legajo;
    public int grado; 
    
    public Estudiante(String nombreEstudiante){
        nombre = nombreEstudiante;
    }
    
    public Estudiante(String nombreEstudiante, String apellido1, String apellido2, int valorLegajo){
        super(nombreEstudiante, apellido1, apellido2);
        legajo = valorLegajo;
    }
    
    public Estudiante(String nombreEstudiante, int valorLegajo, int grado){
        legajo = valorLegajo;
        nombre = nombreEstudiante;
        this.grado = grado;
    }
    
    public int getLegajo(){
        return legajo;
    }
    
    public void setLegajo(int valorLegajo){
        legajo = valorLegajo;     
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
}
