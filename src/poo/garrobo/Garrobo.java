package poo.garrobo;

/**
 * La clase Garrobo sirve para crear garrobos. Cada Garrobo, recibe los datos de
 * la distancia y el tiempo que dispone para recorrerla y el mismo le responde a
 * que velocidad se desplazar para lograrlo (en metros por segundo). Note el uso
 * de la referencia "this" para hacer evidencia del objeto sobre el cual se esta
 * trabajando y dar claridad al codigo.
 */
public class Garrobo {

    /**
     * Nombre del Garrobo
     */
    private String nombre;
    /**
     * Distancia recorrida sobre el agua (en metros)
     */
    private double distancia;
    /**
     * tiempo que tard&oacute; en recorrer dicha distancia
     */
    private double tiempo;

    /**
     * Establece el valor de nombre
     *
     * @param nombre hilera con el nombre del garrobo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el valor de distancia
     *
     * @param distancia real con la distancia recorrida
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Establece el valor de tiempo
     *
     * @param tiempo real con el tiempo registrado por el garrobo
     */
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Retorna el valor de nombre
     *
     * @return nombre hilera con el nombre del garrobo
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Retorna el valor de tiempo
     *
     * @return tiempo real con el valor del tiempo registrado por el garrobo
     */
    public double getTiempo() {
        return this.tiempo;
    }

    /**
     * Retorna el valor de distancia
     *
     * @return distancia real con el valor de la distancia registrado por el
     * garrobo
     */
    public double getDistancia() {
        return this.distancia;
    }

    /**
     * Calcula el tiempo que tarda en recorrer la distancia recibida por
     * par&aacute;metro. Utiliza Tiempo = Distancia / Velocidad.
     *
     * @param distancia que recorrer&aacute; el garrobo
     * @return tiempo que tomar&aacute; en recorrer la distencia
     */
    public double calcularTiempo(double distancia) {
        double tiempo = 0;
        if (this.getTiempo() != 0) {
            double miVelocidad = this.getDistancia() / this.getTiempo(); //calculo mi velocidad
            // Tiempo = Distancia / Velocidad
            tiempo = distancia / miVelocidad;
        }
        return tiempo;
    }

    /**
     * Calcula la distancia que recorre en el tiempo recibido por
     * par&aacute;metro. Utiliza Distancia = Velocidad * Tiempo
     *
     * @param tem tiempo que corre el garrobo
     * @param jhasdf tiempo que corre el garrobo
     * @return distancia recorrido en el tiempo indicado
     */
    public double calcularDistancia(double tiempo) {
        double distancia = 0;
        if (this.getTiempo() != 0) {
            double miVelocidad = this.getDistancia() / this.getTiempo(); //calculo mi velocidad
            // Distancia = miVelocidad * tiempo
            distancia = miVelocidad * tiempo;
        }
        return distancia;
    }
}
