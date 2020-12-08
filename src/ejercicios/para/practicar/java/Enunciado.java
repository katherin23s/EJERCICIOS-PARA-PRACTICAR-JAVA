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
public class Enunciado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea el código de un programa bajo estas premisas. Declara tres variables tipo double A, B y C. Asígnales un valor aleatorio, que debe estar comprendido entre cero y 10, excluido el diez. Muestra el valor de las variables por pantalla.
        double a,b,c;
        
        a = (int) (Math.random() * 9) + 1;
        b = (int) (Math.random() * 9) + 1;
        c = (int) (Math.random() * 9) + 1;
        
       System.out.print("El numero es: "+a);
       System.out.print("El numero es: "+b);
       System.out.print("El numero es: "+c);
    }
    
}
