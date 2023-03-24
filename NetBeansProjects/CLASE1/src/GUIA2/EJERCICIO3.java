/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*String frase;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=scan1.nextLine();
        System.out.println("La frase ingresada se pasa a mayúsculas: " + frase.toUpperCase() + " y la frase ingresada se pasa a minúsculas " + frase.toLowerCase());*/
        
        String frase;
        Scanner scan1 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        frase=scan1.next();
        System.out.println("La frase ingresada se pasa a mayúsculas: " + frase.toUpperCase() + " y la frase ingresada se pasa a minúsculas " + frase.toLowerCase());
        
    }
    
}
