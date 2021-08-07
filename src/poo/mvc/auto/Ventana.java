package poo.mvc.auto;

/*
 * MODELO : Ventana de auto
 * */
public class Ventana {

    int altura;
    int estadoNum;    //cantidad de centimetros en que la ventana esta cerrada

    public void setVentana(int tamano) {  //se recibe como parametro el tamano de la ventana
        altura = tamano;                   //altura maxima de la ventana
        estadoNum = tamano;                //ventana originalmente estara cerrada
    }

    public void up(int c) {               //metodo para subir "c" centimetros el nivel de la ventana
        if (c <= (altura - estadoNum)) {       //no se permite subir mas alla de la altura maxima
            estadoNum = estadoNum + c;
        } else {
            estadoNum = altura;
        }
    }

    public void down(int c) {             //metodo para bajar "c" centimetros el nivel de la ventana
        if (c <= estadoNum) {                //no se permite bajar mas alla de la altura minima
            estadoNum = estadoNum - c;
        } else {
            estadoNum = 0;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getEstadoNum() {
        return estadoNum;
    }
}
