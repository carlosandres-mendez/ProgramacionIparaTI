package semana13.quiz2;

import poo.mvc.nota.*;


public class EquipoSonido {

    private String[] arregloAudios;
    private int indice;
    Parlante parIzq;
    Parlante parDer;
    Parlante sub;
    Reloj reloj;
    Radio radio;

    public EquipoSonido(int cantidadDeAudios) {
        arregloAudios = new String[cantidadDeAudios];
        indice = 0;
        
        parIzq = new Parlante(true,5,'I');
        parDer = new Parlante(true,5,'D');
        sub = new Parlante(true,5,'S');
    }

    public void agregarAudio(String audio) {
        try {
        
            try {
                arregloAudios[indice++] = audio;
                
             
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de audios");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }
    
    public void programarEncendido(int hora, int minuto){
        reloj = new Reloj();
        reloj.setAlarm(hora, minuto);
    }
    
    public String getAudio(int i){
        return arregloAudios[i];
    }

    public String[] getArregloAudios() {
        return arregloAudios;
    }

    public void setArregloAudios(String[] arregloAudios) {
        this.arregloAudios = arregloAudios;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


}