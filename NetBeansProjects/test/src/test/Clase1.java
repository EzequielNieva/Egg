/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void actividad1(String[] args) {
       int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un primer número para sumar");
        num1=scan.nextInt();
        System.out.println("Ingrese un segundo número para sumar");
        num2=scan.nextByte();
        int suma=num1+num2;
        System.out.println("La suma de los números ingresados es: " + suma);  
          
               
       
    }
    
}
