package semana13.quiz2;

import poo.mvc.nota.*;

public class EquipoSonidoControlador {
    private EquipoSonido equipoSonido;
    private EquipoSonidoVista vista;
    
    public EquipoSonidoControlador(){
        equipoSonido = new EquipoSonido(0);
        vista = new EquipoSonidoVista(equipoSonido);
    }
    
    public void iniciar() {
        int op;
        do {
            op = vista.getOpcion();
            switch (op) {
                case 1:
                    if(equipoSonido.getArregloAudios().length==0){
                        int cant = vista.leaTamanoArreglo();
                        String[] elNuevoArreglo = new String[cant];
                        equipoSonido.setArregloAudios(elNuevoArreglo);
                    }
                    
                    vista.agregarAudio();
                    break;
                case 2:
                    vista.reprodicirAudiosOrden();
                    break;
                case 3:
                    vista.reprodicirAudiosAleatorio();
                case 4:
                    equipoSonido.radio.reproducir();
                case 5:
                    //vista.
                    //equipoSonido.programarEncendido(op, op);
                    break;
                default:
            }
        } while (op != 3);
    }
}
