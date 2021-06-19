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
public class EjemploSwitch {

    public static void main(String[] args) {

        int edad = 30;

        if (edad < 15) {

        } else if (edad >= 15 && edad < 40) {

            switch (edad) {
                case 10: {
                    System.out.println("Ud tiene 10 años");
                    break;
                }
                case 20: {
                    System.out.println("Ud tiene 20 años");
                    break;
                }
                case 50: {
                    System.out.println("Ud tiene 50 años");
                    break;
                }
                default: {
                    System.out.println("Este edad no esta contemplada");
                }
            }

        } else if (edad >= 40 && edad < 80) {

        } else {

        }

    }
}
