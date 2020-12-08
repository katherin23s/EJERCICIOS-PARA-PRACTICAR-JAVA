/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.para.practicar.java;

import java.util.Scanner;

/**
 *
 * @author key_s
 */
public class Enunciado3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Como programadores hemos de tratar todo lo que pueda variar como variables (valga la redundancia). 
        ¿El número de vehículos en la empresa será constante? Con toda probabilidad no, seguramente darán de baja algunos vehículos y comprarán otros conforme pasa el tiempo. 
        En el esquema propuesto se nos indica que hay 32 turismos, pero nosotros generaremos un programa que pregunte cuál es el número de turismos y cuál es la capacidad del 
        depósito de los turismos para realizar un cálculo basado en variables y no en parámetros fijos.*/
        Scanner entrada = new Scanner(System.in);
        
        int vehiculoTurismo,capacidadTurismo,necesidadTurismo, VehiculoTodoTerreno, capacidadTodoTerreno, necesidadTodoTerreno;
        
        System.out.println("Inserte cantidad de vehiculos");
        vehiculoTurismo = entrada.nextInt();
        System.out.println("Inserte capacidad de vehiculos Turismo");
        capacidadTurismo = entrada.nextInt();
        
        System.out.println("Inserte cantidad de TodoTerreno");
        VehiculoTodoTerreno = entrada.nextInt();
        System.out.println("Inserte capacidad de vehiculos Todoterreno");
        capacidadTodoTerreno = entrada.nextInt();
        
        necesidadTurismo = vehiculoTurismo * capacidadTurismo;
        necesidadTodoTerreno = VehiculoTodoTerreno*capacidadTodoTerreno;
        
        System.out.print("Imprima necesidad vehiculo turismo: "+necesidadTurismo);
        System.out.print("Imprima necesidad vehiculo todoterreno: "+necesidadTodoTerreno);
    }
    
}
