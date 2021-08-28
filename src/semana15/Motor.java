/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana15;

/**
 *
 * @author Andres
 */
public class Motor {
    float peso;
    String serie;
    String modelo;

    public Motor(float peso, String serie, String modelo) {
        this.peso = peso;
        this.serie = serie;
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
