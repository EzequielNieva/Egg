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
public class EJERCICIO_3 {
     
    public static void main(String[] args) {
        String palab;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        palab =leer.next();
        int num=palab.length();
       
        if (num==8 ) {
            System.out.println("Correcto");
        }
         else {
            System.out.println("Incorrecto");
        
        
        
     }
}
    }
