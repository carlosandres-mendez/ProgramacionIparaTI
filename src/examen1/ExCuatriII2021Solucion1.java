/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class ExCuatriII2021Solucion1 {
    public static void main(String[] args){
        String MENSAJE_ALERTA = "ALERTA! Empresa con mucho COVID";
        int pobSj = 1404242;
        int pobAla = 848146;
        int pobCar = 490903;
        int pobHer = 433677;
        int pobGua = 326953;
        int pobPun = 410929;
        int pobLim = 386862;
        
        
        Scanner s = new Scanner(System.in);
        int opcionMenuSeleccionada;
        
        String nombreEmpresa=null;
        int numProvincia=0;
        int cantTranTotales=0;
        int cantTranTotalesCOVID=-1;
        double montoProdioMes=-1;
        boolean indTieneCreditos=false;
        

        
        while(true){
            System.out.println("Menu\n1.Ingresar datos empresa"
                    + "\n2.Imprimir información de la empresa"
                    + "\n3.Imprimir monto a prestar y tasa de interés"
                    + "\n4.Limpiar e ingresar nueva empresa");
            opcionMenuSeleccionada = s.nextInt();
            
            switch(opcionMenuSeleccionada){
                case 1:{
                    System.out.println("Por favor, digite el nombre de la empresa:");
                    nombreEmpresa = s.next();
                    System.out.println("Por favor, la provincia donde se ubica la empresa. 1.SJ, 2. Alajuela, 3 Cartago"
                            + "4 Heredia, 5 Guanaste, 6 Puntarenas 7 Limón");
                    numProvincia = s.nextInt();
                    if(numProvincia<1 || numProvincia>7){
                        System.out.println("Número inválido.");
                        break;
                    }   
                    System.out.println("Por favor, digite la cantidad de trabajadores de la empresa:");
                    cantTranTotales = s.nextInt();
                    System.out.println("Por favor, digite la cantidad de trabajadores con COVID registrados en la empresa:");
                    cantTranTotalesCOVID = s.nextInt();
                    System.out.println("Por favor, digite el monto ingreso promedio por mes de la empresa:");
                    montoProdioMes = s.nextDouble();
                    System.out.println("Por favor, digite si la empresa tiene créditos:");
                    indTieneCreditos = s.nextBoolean();

                    break;
                }
                case 2:{
                    //si el usuario ya ingreso los datos de la empresa
                    if(nombreEmpresa!=null && numProvincia!=0 && cantTranTotales!=0
                            && cantTranTotalesCOVID!=-1 && montoProdioMes!=-1){
                        System.out.println("nombre Empresa:"+nombreEmpresa);
                        System.out.println("num Provincia:"+numProvincia);
                        System.out.println("cant Tran Totales:"+cantTranTotales);
                        System.out.println("cant Tran Totales COVID:"+cantTranTotalesCOVID);
                        System.out.println("monto Prodio Mes:"+montoProdioMes);
                        System.out.println("ind Tiene Creditos:"+indTieneCreditos);
                        
                        if(cantTranTotalesCOVID>20)
                            System.out.println(MENSAJE_ALERTA);
                    }
                    //sino (el usuario no ha ingresado los datos de la empresa)
                    else{
                        System.out.println("Primero debe ingresar los datos de la empresa.");
                    }
                    break;
                }
                case 3:{
                    double monto = 0.0d;
                    double tasa = 0.0d;
                    
                    //**** CÁLCULO MONTO A PRESTAR ****
                    int pobProvincia=0;
                    switch(numProvincia){
                        case 1:{ 
                            pobProvincia = pobSj;
                            break;
                        }
                        case 2:{ 
                            pobProvincia = pobAla;
                            break;
                        }   
                        case 3:{ 
                            pobProvincia = pobCar;
                            break;
                        }
                        case 4:{ 
                            pobProvincia = pobHer;
                            break;
                        }
                        case 5:{ 
                            pobProvincia = pobGua;
                            break;
                        }
                        case 6:{ 
                            pobProvincia = pobPun;
                            break;
                        }
                        case 7:{ 
                            pobProvincia = pobLim;
                            break;
                        }
                    }
 
                    double resultadoDiv = ((double)cantTranTotalesCOVID) / ((double)cantTranTotales);
                    monto = resultadoDiv * pobProvincia;
                    
                    //**** CÁLCULO TASA INTERÉS ****
                    tasa = obtenerTasaInteres(cantTranTotales);
                    
                    if(indTieneCreditos){
                        double sumatoria=0.0d;
                        short numCreditos=0;
                        double temp = 0.0d;
                        
                        do{
                            System.out.println("Por favor, digite un monto o -1 para salir:");
                            temp = s.nextDouble();
                            if(temp != -1){
                                sumatoria += temp;
                                numCreditos++;
                            }
                        }while(temp!= -1);
                        
                        double promedio = sumatoria/numCreditos;
                        double ajuste = promedio/100000d;
                        tasa = tasa + ajuste;
                    }
                    
                    
                    if(monto > 1000000d)
                        monto = 1000000d;
                    System.out.println("Monto: "+monto+" Tasa: "+tasa);
                    break;
                }
                case 4:{
                    nombreEmpresa=null;
                    numProvincia=0;
                    cantTranTotales=0;
                    cantTranTotalesCOVID=-1;
                    montoProdioMes=-1;
                    indTieneCreditos=false;
                }
            }
        
        }
        
        
    }
    
    public static double obtenerTasaInteres(double cantTranTotales){
        double resultado=0.0d;
        if(10 > cantTranTotales && cantTranTotales > 0){
            resultado = 0.5d;
        }
        else if(30 > cantTranTotales && cantTranTotales >= 10){
            resultado = 0.4d;
        }
        else if(30 >= cantTranTotales){
            resultado = 0.3d;
        }
        return resultado;
    }
    
    public static double obtenerTasaInteres(double cantTranTotales, double cantTrabCOVID){
        double resultado=0.0d;
        
        return resultado;
    }
    
    public static double tasainteres(int cantidad) {
        Scanner s = new Scanner(System.in);

        int monto = 0;
        double promedio;
        double ajuste;
        int cantidadTemp=cantidad;

        while (cantidadTemp > 0) {
            System.out.println("Digite el monto: ");
            monto = s.nextInt();
            monto = monto + monto;
            cantidadTemp--;
        }

        promedio = monto / cantidad;
        ajuste = promedio / 100000;

        return ajuste;
    }
    
}
