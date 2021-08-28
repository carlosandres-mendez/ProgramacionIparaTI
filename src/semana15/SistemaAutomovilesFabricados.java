package semana15;

import poo.mvc.nota.*;


public class SistemaAutomovilesFabricados {
    private static final int CANTIDAD_MAX_AUTOMOVILES = 1000;

    private Automovil[] arregloAutomoviles;
    private int cantAutomovilesRegistrados;

    public SistemaAutomovilesFabricados() {
        arregloAutomoviles = new Automovil[CANTIDAD_MAX_AUTOMOVILES];
        cantAutomovilesRegistrados = 0;
    }

    public void agregarAutomovil(Automovil auto) {
        try {
        
            try {
                arregloAutomoviles[cantAutomovilesRegistrados++] = auto;
                
                
                //cantAutomovilesRegistrados = cantAutomovilesRegistrados + 1;
                //arregloAutomoviles[cantAutomovilesRegistrados] = auto;
                

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
                cantAutomovilesRegistrados--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }
    
    public void establacerVehiculoVendido(Automovil auto){
        if(auto!=null)
            auto.setIndEstado((byte)2);
    }
    
    public void establacerVehiculoDevuelto(Automovil auto){
        if(auto!=null)
            auto.setIndEstado((byte)3);
    }

    public int getIndice() {
        return cantAutomovilesRegistrados;
    }

    public Automovil getAutomovilPosicion(int i) {
        return arregloAutomoviles[i];
    }

    public Automovil[] getArregloAutomoviles() {
        return arregloAutomoviles;
    }

    public void setArregloAutomoviles(Automovil[] arregloAutomoviles) {
        this.arregloAutomoviles = arregloAutomoviles;
    }


}