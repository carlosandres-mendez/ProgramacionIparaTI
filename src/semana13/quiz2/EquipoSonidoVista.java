package semana13.quiz2;

import poo.mvc.nota.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EquipoSonidoVista {

    private EquipoSonido equipoSonido;

    public EquipoSonidoVista(EquipoSonido notaInstanciada) {
        this.equipoSonido = notaInstanciada;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
    }

    public void agregarAudio() {
        String audio;
        
        audio = JOptionPane.showInputDialog("Audio?");

        equipoSonido.agregarAudio(audio);
    }

    public void reprodicirAudiosOrden() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < equipoSonido.getIndice(); i++) {
            jt.append(equipoSonido.getAudio(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }
    
    public void reprodicirAudiosAleatorio() {
        
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Agregar audio\n"
                   + "2. Reproducir audios orden\n"
                   + "3. Reproducir audios aleatorio\n"
                   + "4. Reproducir radio\n"
                   + "5. Programar encendido automático\n"         
                   + "6.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
