package poo.mvc.auto;

/*
 * MODELO : Auto con ventanas manipulables individualmente
 * */

public class Auto {

    VentanaControlador v[];           //aca se indica que el Auto consta de ventanas, pero no se indica cuantas
    int placa;               //Id del Auto

    //como la definicion del numero de ventanas se hace en tiempo de ejecucion, no se usa el constructor
    //para reservar espacio en tiempo de compilacion, sino que se usa el constructor "deafult" 
    //que no requiere de especificacion
    public void setVentanas(int c) {   //metodo que define y crea el # de ventanas en el auto
        v = new VentanaControlador[c];            //se indica que el Auto consta de "c" ventanas
        for (int i = 0; i < c; i++) {           //para cada una de esas "c" ventanas, se pide el espacio requerido
            v[i] = new VentanaControlador();          //el constructor de Ventana solicita el espacio de cada objeto
        }
    }

    public void setPlaca(int nP) {
        placa = nP;
    }

    public int getPlaca() {
        return placa;
    }

    public void suba(int i, int c) {
        v[i].cerrar(c);                  //se manda un mensaje al i-esimo objeto guardado en el "array"
    }

    public void baje(int i, int c) {
        v[i].abrir(c);                  //se manda un mensaje al i-esimo objeto guardado en el "array"
    }

    public VentanaControlador getVentana(int i) { //metodo retorna un dato complejo, i.e. un objetivo tipo VentanaControlador
        return v[i];                    // se devuelve el i-esimo objeto, que es pedido por el programador
    }

    public int getLength() {           //se devuelve la cantidad de objetos que almacena el "array" de ventanas
        return v.length;                //esta es la cantidad de ventanas que posee el Auto (ver linea 15)
    }
}
