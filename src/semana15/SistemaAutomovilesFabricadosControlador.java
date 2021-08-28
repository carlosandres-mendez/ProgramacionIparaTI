package semana15;

import poo.mvc.nota.*;

public class SistemaAutomovilesFabricadosControlador {
    private SistemaAutomovilesFabricados sistemaAutomoviles;
    private SistemaAutomovilesFabricadosInterfaz vista;
    
    public SistemaAutomovilesFabricadosControlador(){
        sistemaAutomoviles = new SistemaAutomovilesFabricados();
        vista = new SistemaAutomovilesFabricadosInterfaz(sistemaAutomoviles);
    }
    
    public void iniciar() {
        int op;
        do {
            op = vista.getOpcion();
            switch (op) {
                case 1:
                    
                    vista.soliciteDatosAutomovil();
                    break;
                case 2:
                    vista.muestreAutomovilesEnBodega();
                    break;
                case 3:
                    vista.muestreAutomovilesVendidos();
                    break;
                case 4:
                    vista.muestreAutomovilesDevueltos();
                    break;
                case 5:
                    vista.solicitePosicionAutomovilEstablecerVendido();
                    break;
                case 6:
                    vista.solicitePosicionAutomovilEstablecerDevuelto();
                    break;
                default:
            }
        } while (op != 3);
    }
}
