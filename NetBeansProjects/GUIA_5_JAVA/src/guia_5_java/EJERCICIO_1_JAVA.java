/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_java;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIO_1_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int i;
        int[] vector = new int[100];
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("Vector original: ");
        
        for (i=0; i<100; i++){
            vector[i]=i;
            System.out.println( vector[i]);
        }
         System.out.println("Vector descendente");
        
        for (i=0; i<100; i++){     
            System.out.println( vector[99-i]);
        }
    }
}
