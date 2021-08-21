package semana13.solucion2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NotaVista {

    private ExpedienteEstudiante nota;

    public NotaVista(ExpedienteEstudiante notaInstanciada) {
        this.nota = notaInstanciada;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de cursos de estudiantes."));
    }

    public void leaNota() {
        String codigoCurso;
        codigoCurso = JOptionPane.showInputDialog("Código curso?");
        
        String nombreCurso;
        nombreCurso = JOptionPane.showInputDialog("Nombre curso?");
        
        String carne;
        carne = JOptionPane.showInputDialog("Carné?");
        
        String nombreEstudiante;
        nombreEstudiante = JOptionPane.showInputDialog("Nombre estudiante?");
        
        double notaDigitada;
        notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));
        
        Curso c = new Curso(codigoCurso,nombreCurso);
        Estudiante e = new Estudiante(carne,nombreEstudiante);
        CursoEstudiante ce = new CursoEstudiante(c,e,notaDigitada);

        nota.agregarRegistro(ce);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndice(); i++) {
            jt.append(
                    nota.getNota(i).getCurso().getCodigo()
              + " "+nota.getNota(i).getCurso().getNombre() 
              + " "+nota.getNota(i).getEstudiante().getCarne()
              + " "+nota.getNota(i).getEstudiante().getNombre()
              + " "+nota.getNota(i).getNota()
            + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar registro\n2. Mostrar registros\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
