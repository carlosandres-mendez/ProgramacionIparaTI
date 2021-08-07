package poo.mvc.auto;

/*
 * VISUALIZADOR: Clase que maneja metodos de entrada salida de la clase Auto
 * */

import javax.swing.JOptionPane; //biblioteca de metodos para el manejo de dialogos de entrada/salida

//la siguiente instruccion define la clase AutoVista como un tipo particular de JOptionPane,
//lo que permite usar todos los metodos de la misma con el objeto "this"
public class AutoVista extends JOptionPane {

    Auto a;                    //atributo local del visualizador de Auto

    public AutoVista(Auto aa) {   //constructor de visualizador para instancia de Auto "aa"
        a = aa;                  //mapeo temporal entre un Auto y el atributo local
    }

    public void muestreVentana(int i) {   //metodo que muestra el estado de la ventana #i
        a.getVentana(i).showEstado();      //note que aca se envia un mensaje a un objeto interno del Auto
        //a.getVentana(i) recupera la i-esima ventana del Auto
        //a la ventana anterior se le manda la orden de mostrar su estado
    }

    public void leaPlaca() {              //metodo que permite al usuario definir el # de placa del auto
        a.setPlaca(Integer.parseInt(this.showInputDialog("Placa?")));
        //se pide al usuario dar un numero de placa
        //se transforma la hilera que da el usuario a un entero
        //finalmente ese entero se envia como parametro al metodo
        //del auto que instancia la placa, i.e. setPlaca
    }

    public void definaCantVentanas() {    //metodo para establecer el # de ventanas del Auto
        a.setVentanas(Integer.parseInt(this.showInputDialog("Cant Ventanas?")));
    }

    public void definaTamanoVentanas() {  //metodo para definir un tamano estandar de ventana
        // si se desea un tama;o individual, comentarice la linea siguiente instruccion y quite el 
        // comentario de la instruccion dentro del for. 
        int tam = Integer.parseInt(this.showInputDialog("Tamano estandard (cm) de las ventanas"));

        //para tener tamanos individuales la siguiente linea debe reemplazar a la anterior
        //int tam;
        for (int i = 0; i < a.getLength(); i++) {
            //a.getVentana(i).getVentanaVista().definaTamano();  //distinto tamano por ventana
            a.getVentana(i).getVentana().setVentana(tam);      //tamano estandard
        }
    }

    public void showPlaca() {         // metodo que pide al Auto su numero de placa y luego lo muestra
        this.showMessageDialog(null, "Auto con placa # " + a.getPlaca());
    }

    public int getOpcion() {          //menu que no maneja excepciones
        return Integer.parseInt(this.showInputDialog(null, "Que desea hacer: \n1: "
                + "Subir ventana. \n2: Bajar ventana. \n3: Ver el estado de la ventana."));
    }

    public int getNumVentana() {      //metodo que pide al usario el numero de la ventana a manipular
        return Integer.parseInt(this.showInputDialog(null, "# de ventana a usar?"));
    }

    public int getCantCentimetros() { //metodo que le permite al usuario indicar la cantidad de 
        //centimetros en que se va a cerrar o a abrir la ventana del Auto
        return Integer.parseInt(this.showInputDialog(null, "Cantidad de cm a abrir / cerrar?"));
    }
}
