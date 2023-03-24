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
public class EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palab;
        String num;
        String num2;
        num2="A";
        num="a";
                
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        palab =leer.next();
       String pal=(palab.substring(0,1));
        System.out.println(palab.substring(0,1));
        System.out.println(pal);
       if ( pal==num|| pal==num2) {
           System.out.println("Correcto");  
        }
         else {
           System.out.println("INCORRECTO");
        }
      }
    }
