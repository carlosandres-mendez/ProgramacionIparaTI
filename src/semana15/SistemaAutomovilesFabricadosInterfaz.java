package semana15;

import poo.mvc.nota.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SistemaAutomovilesFabricadosInterfaz {

    private SistemaAutomovilesFabricados sistemaAutos;

    public SistemaAutomovilesFabricadosInterfaz(SistemaAutomovilesFabricados sistemaAutos) {
        this.sistemaAutos = sistemaAutos;
    }
    

    public void soliciteDatosAutomovil() {

        int anno = Integer.parseInt(JOptionPane.showInputDialog("Año?"));

        Automovil auto = new Automovil(4, "CRV", "4x4", anno, 200.9f,"MOTOR-RR0011","MOT-MODEO-11");
        sistemaAutos.agregarAutomovil(auto);
    }
    
    public void solicitePosicionAutomovilEstablecerVendido() {

        int pos = Integer.parseInt(JOptionPane.showInputDialog("Numero posicion a estb vendido?"));
        sistemaAutos.establacerVehiculoVendido(sistemaAutos.getAutomovilPosicion(pos));
    }   
    
    public void solicitePosicionAutomovilEstablecerDevuelto() {

        int pos = Integer.parseInt(JOptionPane.showInputDialog("Numero posicion a estb devuelto?"));
        sistemaAutos.establacerVehiculoDevuelto(sistemaAutos.getAutomovilPosicion(pos));
    }

    public void muestreAutomovilesEnBodega() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < sistemaAutos.getIndice(); i++) {
            if(sistemaAutos.getAutomovilPosicion(i).getIndEstado()==1){
                jt.append(sistemaAutos.getAutomovilPosicion(i).getModelo() + "\n"
                       + sistemaAutos.getAutomovilPosicion(i).getEstilo()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getModelo()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getSerie()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getPeso()+ "\n"
                );
            }
        }
        JOptionPane.showMessageDialog(null, jt);
    }
    
    public void muestreAutomovilesVendidos() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < sistemaAutos.getIndice(); i++) {
            if(sistemaAutos.getAutomovilPosicion(i).getIndEstado()==2){
                jt.append(sistemaAutos.getAutomovilPosicion(i).getModelo() + "\n"
                       + sistemaAutos.getAutomovilPosicion(i).getEstilo()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getModelo()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getSerie()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getPeso()+ "\n"
                );
            }
        }
        JOptionPane.showMessageDialog(null, jt);
    }
    
    public void muestreAutomovilesDevueltos() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < sistemaAutos.getIndice(); i++) {
            if(sistemaAutos.getAutomovilPosicion(i).getIndEstado()==3){
                jt.append(sistemaAutos.getAutomovilPosicion(i).getModelo() + "\n"
                       + sistemaAutos.getAutomovilPosicion(i).getEstilo()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getModelo()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getSerie()+ "\n"
                        + sistemaAutos.getAutomovilPosicion(i).getMotor().getPeso()+ "\n"
                );
            }
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar automóvil\n"
                    + "2. Mostrar En Bodega\n"
                    + "3. Mostrar Vendidos\n"
                    + "4. Mostrar Devueltos\n"
                    + "5. Establecer un vehículo como Vendido\n"
                    + "6. Establecer un vehículo como Devuelto\n"
                    + "7.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
