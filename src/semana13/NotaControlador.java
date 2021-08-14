package semana13;

import poo.mvc.nota.*;

public class NotaControlador {
    private ExpedienteEstudiante nota;
    private NotaVista nv;
    
    public NotaControlador(){
        nota = new ExpedienteEstudiante(0);
        nv = new NotaVista(nota);
    }
    
    public void iniciar() {
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    if(nota.getArregloNotas().length==0){
                        int cant = nv.leaTamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        nota.setArregloNotas(elNuevoArreglo);
                        
                        String[] elNuevoArregloCiclos = new String[cant];
                        nota.setArregloCiclos(elNuevoArregloCiclos);
                    }
                    
                    nv.leaNota();
                    break;
                case 2:
                    nv.muestreNotas();
                    break;
                default:
            }
        } while (op != 3);
    }
}
