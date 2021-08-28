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
public class Automovil {
    private Motor motor;
    private String color;
    private int numPuertas;
    private String modelo;
    private String estilo;
    private int anno;
    private byte indEstado; //1=En Bodega, 2=Vendido, 3=Devuelto

    public Automovil(Motor motor, String color, int numPuertas, String modelo, String estilo, int anno) {
        this.motor = motor;
        this.color = color;
        this.numPuertas = numPuertas;
        this.modelo = modelo;
        this.estilo = estilo;
        this.anno = anno;
        
        //variables inicializar predeterminada
        indEstado=1;
    }

    public Automovil(int numPuertas, String modelo, String estilo, int anno, float pesoMotor, String serieMotor,String modeloMotor) {
        this.numPuertas = numPuertas;
        this.modelo = modelo;
        this.estilo = estilo;
        this.anno = anno;
        this.motor = new Motor(pesoMotor, serieMotor, modeloMotor);
        
        //variables inicializar predeterminada
        indEstado=1;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public byte getIndEstado() {
        return indEstado;
    }

    public void setIndEstado(byte indEstado) {
        this.indEstado = indEstado;
    }
    
    
}
