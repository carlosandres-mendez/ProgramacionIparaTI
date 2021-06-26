/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author carlosandres.mendez
 */
public class ExCuatriI2021 {
    public static void main(String[] args){
        int CANT_ASTERISCOS=7;
        String nombre="";
        String apellidos="";
        int edad=0;
        char sexo='M'; //'M' Mujer, 'H' Hombre
        boolean indAntecedentes=false;
        boolean indCovid=false;
        int nivelSalud=0; //número del 1 al 10
        
        //contadores
        int contPersCitas=0;
        int contPersCovid=0;
        
        Scanner escaner = new Scanner(System.in);
        
        while(true){
            System.out.println("Menu \n1) Digitar datos de persona\n2)Imprimir información competa del paciente"
                    + "\n3)Generar dos citas de vacunación\n4)Estado inicial\n5)Signo de la inyección COVID");
            int opcion = escaner.nextInt();
            
            switch(opcion){
            
                case 1:{
                    System.out.println("Digite el nombre");
                    nombre = escaner.next();
                    System.out.println("Digite el apellido");
                    apellidos = escaner.next();
                    System.out.println("Digite la edad");
                    edad = escaner.nextInt();
                    System.out.println("Digite M Mujer o H Hombre");
                    sexo = escaner.next().charAt(0);
                    System.out.println("Tiene COVID?");
                    indCovid = escaner.nextBoolean();
                    if(indCovid)
                        contPersCovid++;
                    
                    System.out.println("Tiene antecedentes?");
                    indAntecedentes = escaner.nextBoolean();
                    System.out.println("Digite el nivel de salud (# del 1-10)");
                    nivelSalud = escaner.nextInt();
                    break;
                }
                case 2:{
                    if(!nombre.equals("")){
                        System.out.println("Datos de la persona: "
                                +"\n "+nombre
                                +"\n "+apellidos
                                +"\n "+edad
                                +"\n "+sexo             
                                +"\n "+indCovid 
                                +"\n "+nivelSalud 
                        );

                        if(edad>60 || indAntecedentes || indCovid){
                            System.out.println("ALERTA!");
                        }
                    }
                    else
                        System.out.println("Debe ingresar los datos de la persona.");
                    break;
                }
                case 3:{
                    registrarCita(edad,nivelSalud,contPersCitas,indCovid);
                    contPersCitas++;
                    break;
                }
                case 4:{
                    nombre="";
                    apellidos="";
                    edad=0;
                    sexo='M'; //'M' Mujer, 'H' Hombre
                    indAntecedentes=false;
                    indCovid=false;
                    nivelSalud=0; //número del 1 al 10
                    break;
                } 
                case 5:{
                    
                    for(int i=0;i<CANT_ASTERISCOS;i++){
                        System.out.print("*\t");
                    }
                    System.out.println();
                    
                    for(int i=0;i<CANT_ASTERISCOS;i++){
                        System.out.print("*\t");
                    }
                    System.out.println();
                    
                    for(int i=0;i<CANT_ASTERISCOS;i++){
                        for(int j=0;j<CANT_ASTERISCOS;j++){
                            if(i==j)
                                System.out.print("*\t");
                            else{
                                System.out.print(" \t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
            }
        
        }
        
    }
    
    /**
     * Metodo no se utiliza en el sistema, pero se implementa por requerimiento sobrecarga
     * @param edad
     * @param nivelSalud
     * @param contPersCitas
     */
    public static void registrarCita(int edad, int nivelSalud, int contPersCitas){
        String mes = "";
        if(edad>90){
            mes = "mayo";
        }
        else if(edad>70){
            mes = "junio";
        }
        else if(edad>50){
            mes = "julio";
        }
        else{
            mes = "agosto";
        }

        int dia = nivelSalud + contPersCitas;
        System.out.println("Su primera cita es " + dia + " " + mes + "2021");
        System.out.println("Su segunda cita es " + (dia+10) + " " + mes + "2021");
    }
    
    /**
     * Metodo para calcular y registrar las citas
     * @param edad
     * @param nivelSalud
     * @param contPersCitas
     * @param indCovid
     */
    public static void registrarCita(int edad, int nivelSalud, int contPersCitas, boolean indCovid){
        String mes = "";
        if(edad>90){
            mes = "mayo";
        }
        else if(edad>70){
            mes = "junio";
        }
        else if(edad>50){
            mes = "julio";
        }
        else{
            mes = "agosto";
        }
        
        int dia;
        if(indCovid){
            dia = nivelSalud + 1;
        }
        else{
            dia = nivelSalud + contPersCitas;
        }
        System.out.println("Su primera cita es " + dia + " " + mes + "2021");
        System.out.println("Su segunda cita es " + (dia+10) + " " + mes + "2021");
    }
}