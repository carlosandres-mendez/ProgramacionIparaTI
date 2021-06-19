/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;
// Fig. 5.9: CalificacionesLetra.java
// La clase CalificacionesLetra usa la instrucción switch para contar las calificaciones de letra.

import java.util.Scanner;

public class CalificacionesLetra {

    public static void main(String[] args) {
        int total = 0; // suma de calificaciones
        int contadorCalif = 0; // número de calificaciones introducidas
        int aCuenta = 0; // cuenta de calificaciones A
        int bCuenta = 0; // cuenta de calificaciones B
        int cCuenta = 0; // cuenta de calificaciones C
        int dCuenta = 0; // cuenta de calificaciones D
        int fCuenta = 0; // cuenta de calificaciones F

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Introduzca las calificaciones en el rango de 0-100.",
                "Escriba el indicador de fin de archivo para terminar la entrada:",
                "En UNIX/Linux/Mac OS X escriba <Ctrl> d y oprima Intro",
                "En Windows escriba <Ctrl> z y oprima Intro");

        // itera hasta que el usuario introduzca el indicador de fin de archivo
        while (entrada.hasNext()) {
            int calificacion = entrada.nextInt(); // lee calificacion
            total += calificacion; // suma calificacion al total
            ++contadorCalif; // incrementa el número de calificaciones

            // incrementa el contador de calificación de letra apropiado
            switch (calificacion / 10) {
                case 9: // calificacion estaba entre 90
                case 10: // y 100, inclusive
                    ++aCuenta;
                    break; // sale del switch

                case 8: // calificacion estaba entre 80 y 89
                    ++bCuenta;
                    break; // sale del switch

                case 7: // calificacion estaba entre 70 y 79
                    ++cCuenta;
                    break; // sale del switch

                case 6: // calificacion estaba entre 60 y 69
                    ++dCuenta;
                    break; // sale del switch

                default: // calificacion era menor que 60
                    ++fCuenta;
                    break; // opcional; sale del switch de todas formas
            } // fin de switch
        } // fin de while

        // muestra reporte de calificaciones
        System.out.printf("%nReporte de calificaciones:%n");

        // si el usuario introdujo al menos una calificación...
        if (contadorCalif != 0) {
            // calcula el promedio de todas las calificaciones introducidas
            double promedio = (double) total / contadorCalif;

            // muestra resumen de resultados en pantalla
            System.out.printf("El total de las %d calificaciones introducidas es %d%n",
                    contadorCalif, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Numero de estudiantes que recibieron cada calificacion:",
                    "A: ", aCuenta, // muestra número de calificaciones A
                    "B: ", bCuenta, // muestra número de calificaciones B
                    "C: ", cCuenta, // muestra número de calificaciones C
                    "D: ", dCuenta, // muestra número de calificaciones D
                    "F: ", fCuenta); // muestra número de calificaciones F
        } // fin de if
        else // no se introdujeron calificaciones, por lo que se muestra el mensaje apropiado
        {
            System.out.println("No se introdujeron calificaciones");
        }
    } // fin de main
} // fin de la clase CalificacionesLetra
