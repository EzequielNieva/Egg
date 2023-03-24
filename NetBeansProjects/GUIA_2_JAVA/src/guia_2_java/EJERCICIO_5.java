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
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        
        System.out.println("Ingrese un numero entero limite");
        int num = leer.nextInt();
        do {
        System.out.println("Ingrese numeros para superar el limite");
        int numeros = leer.nextInt();
        suma += numeros;
        if (suma > num){       
            break;
        }
        } while (suma > 0);
        
    }
    

}