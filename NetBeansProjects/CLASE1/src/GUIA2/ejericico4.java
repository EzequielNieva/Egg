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
public class ejericico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int C;
        Scanner scan4 = new Scanner(System.in); 
        System.out.println("Ingrese los grados centígrados para convertirlos en Faren");
        C = scan4.nextInt();
        int F = 32 + (9*C/5);
        System.out.println("Los grados centígrafos ingresados corresponden a " + F + " grados Farenheit");
    }
    
}
