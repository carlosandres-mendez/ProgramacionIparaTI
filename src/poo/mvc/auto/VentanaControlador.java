package poo.mvc.auto;

/*
 * CONTROLADOR: Clase que maneja tanto la clase Ventana como su Visualizador asociado
 * */

public class VentanaControlador {   //Controlador perdurable (persistente) puesto que posee atributos y metodos
    //Note que solo se define los atributos

    Ventana v;
    VentanaVista vv;

    public VentanaControlador() {      //constructor que pide y asigna espacio a objetos que controla
        v = new Ventana();
        vv = new VentanaVista(v);
    }

    public void setTamano() { //por delegacion se define el tamano de la ventana
        v.setVentana(vv.definaTamano());  //note que es el visualizador el que define el tamano
    }

    public void abrir(int c) {           //metodo que abre "c" centimetros la ventana
        v.down(c);                         //se delega en el respectivo metodo del modelo
    }

    public void cerrar(int c) {           //metodo que cierra "c" centimetros la ventana
        v.up(c);                            //se delega en el respectivo metodo del modelo
    }

    public void showEstado() {             //se muestra porcentaje de apertura de la ventana
        vv.showEstadoNum();
    }

    public VentanaVista getVentanaVista() {      //se devuelve objeto complejo: el Visualizador
        return vv;
    }

    public Ventana getVentana() {         //se devuelve objeto complejo: el Modelo
        return v;
    }
}
