/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author Andres
 */
public class EjemploSwitchTexto {

    public static void main(String[] args) {

        String ingrediente="peperoni";


        switch (ingrediente) {
            case "piña": {
                System.out.println("piña");
                break;
            }
            case "peperoni": {
                System.out.println("peperoni");
                break;
            }
            case "jamon": {
                System.out.println("jamon");
                break;
            }
            default: {
                System.out.println("Este ingrediente no esta contemplado");
            }
        }

       

    }
}
