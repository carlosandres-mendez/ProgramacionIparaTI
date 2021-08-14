package semana13;

import poo.mvc.nota.*;


public class ExpedienteEstudiante {

    private double[] arregloNotas;
    private String[] arregloCiclos;
    private int indice;

    public ExpedienteEstudiante(int cantidadDeNotas) {
        arregloNotas = new double[cantidadDeNotas];
        arregloCiclos = new String[cantidadDeNotas];
        indice = 0;
    }

    public void agregarNota(double notaEstudiante, String ciclo) {
        try {
        
            try {
                arregloNotas[indice] = notaEstudiante;
                arregloCiclos[indice] = ciclo;
                indice++;
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
                //indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndice() {
        return indice;
    }

    public double getNota(int i) {
        return arregloNotas[i];
    }
    
    public String getCiclo(int i) {
        return arregloCiclos[i];
    }    

    public double[] getArregloNotas() {
        return arregloNotas;
    }

    public void setArregloNotas(double[] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }

    public String[] getArregloCiclos() {
        return arregloCiclos;
    }

    public void setArregloCiclos(String[] arregloCiclos) {
        this.arregloCiclos = arregloCiclos;
    }  
}