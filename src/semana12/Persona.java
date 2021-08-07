/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

import java.util.Objects;
import semana11.*;

/**
 *
 * @author Andres
 */
public class Persona {
    String cedula;
    byte edad;
    float estatura;
    private float peso;
    String nombre;
    String apellido1;
    String apellido2;
    Direccion direccion;
    
    //***** Comportamientos *******
    public void hablar(){
        System.out.println("hola");
    }
    
    public void caminar(){
        peso = 10;
    }
    
    //**** Constructores *****
    
    public Persona(){}
    
    public Persona(String nombre, String apellido1, String apellido2) {
        if(nombre==null || apellido1==null || apellido2==null)
        {
        //new Exception
        }
        else{
            System.out.println("pruebTTTTTTTTTT");
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            peso = 10;
        }
    }

    public Persona(byte edad, float estatura, float peso, String nombre, String apellido1, String apellido2) {
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        peso = 10;
    }
        
    
    //****** Gets y Set *******
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(nombre.trim().equals("")){
            System.out.println("Nombre invalido");
        }
        else{
            this.nombre = nombre;
        }
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (Float.floatToIntBits(this.estatura) != Float.floatToIntBits(other.estatura)) {
            return false;
        }
        if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido1, other.apellido1)) {
            return false;
        }
        if (!Objects.equals(this.apellido2, other.apellido2)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }
    

}
