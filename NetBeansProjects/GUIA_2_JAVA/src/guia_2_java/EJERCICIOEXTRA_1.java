/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_java;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIOEXTRA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("ingresa la cantidad de minutos");
        Scanner leer = new Scanner(System.in);
        long Mi = leer.nextInt();
        long H = Mi/60;
        long D = H/24;
        long  DI=Math.round(D);
          H=H-D*24;
          H=Math.round(H);
          System.out.println("el valor ingresado corresponda a "+D+" Dias y "+H+" horas");
            
    }
    
}