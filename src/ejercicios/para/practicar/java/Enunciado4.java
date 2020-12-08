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
public class Enunciado4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Transformar en código el pseudocódigo que se muestra a continuación, correspondiente al cálculo del volumen de un cilindro dados su altura y diámetro.
        Scanner entrada = new Scanner(System.in);
        double altura, diametro,radio, volumen,pi,resultado;
        pi=3.1416;
        
        System.out.print("Insertar diametro: ");
        diametro = entrada.nextDouble();
        
        System.out.print("Insertar altura: ");
        altura = entrada.nextDouble();
        
        radio = (diametro/2)/pi;
        
        volumen = pi*(radio*radio)*altura;
        
       System.out.print("El volumen es: "+volumen);
    }
    
}
