package poo.mvc.auto;

/*
 * CONTROLADOR: Clase que maneja tanto la clase Auto como su Visualizador asociado
 * */

public class AutoControlador {

    public void iniciar() {
        //atributos dentro del controlador temporal (transiente). Se indica que es temporal puesto que para esta
        //clase no se definen atributos, ni metodos.

        Auto a = new Auto();         //se pide espacio para una instancia de Auto
        AutoVista av = new AutoVista(a); //se asocia instancia de Auto con su visualizador
        int opcion;                //variable para manejar la opcion de trabajo que da el usuario
        int ventana;               //ventana que el usuario desea manipular

        av.definaCantVentanas();   //se permite al usuario indicar la cantidad de ventanas del Auto
        av.definaTamanoVentanas(); //usuario define el tamano de las ventanas
        av.leaPlaca();             //usuario indica la identificacion del Auto

        do {                        //se inicia ciclo sin fin para procesar opciones dadas por el usuario
            ventana = av.getNumVentana();    //usuario indica la ventana a manejar
            opcion = av.getOpcion();         //usuario indica trabajo a realizar con la ventana

            switch (opcion) {                  //con la opcion de trabajo dada por el usuario haga lo siguiente
                case 1:                        //subir               
                    a.suba(ventana, av.getCantCentimetros());
                    break;
                case 2:                        //bajar
                    a.baje(ventana, av.getCantCentimetros());
                    break;
                case 3:                        //mostrar estado
                    av.muestreVentana(ventana);
                    break;
            }
        } while (true);
    }
}
