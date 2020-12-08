/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.para.practicar.java;

/**
 *
 * @author key_s
 */
public class Enunciado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el código de un programa que genere tres números enteros aleatorios A, B, C comprendidos entre 65 y 90, ambos inclusive, y los muestre en pantalla.
        int a = (int) (Math.random() * (91 - 65)) + 65;
        int b = (int) (Math.random() * (91 - 65)) + 65;
        int c = (int) (Math.random() * (91 - 65)) + 65;
        
        System.out.print("random"+a);
        System.out.print("random"+b);
        System.out.print("random"+c);
    }
    
}
