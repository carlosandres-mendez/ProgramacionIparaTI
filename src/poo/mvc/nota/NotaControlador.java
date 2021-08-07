package poo.mvc.nota;

public class NotaControlador {
    private Nota nota = new Nota(2);
    private NotaVista nv = new NotaVista(nota);
    
    public void iniciar() {
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
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
