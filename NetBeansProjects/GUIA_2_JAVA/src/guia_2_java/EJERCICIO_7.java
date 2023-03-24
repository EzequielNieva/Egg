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
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto = 0;
        int incorrecto = 0;
        do{
            System.out.println("Ingrese una cadena de maximo 5 caracteres");
            cadena = leer.nextLine();
            if (cadena.length() > 5){
                System.out.println("Cadena incorrecta");
                incorrecto += 1;
                System.out.println("te pasaste de 5");
            } else {
                if (cadena.substring(0,1).equals("x") && cadena.substring(cadena.length()-1).equals("o")){
                    System.out.println("Cadena correcta");
                    correcto += 1;
                } else {
                    System.out.println("Cadena incorrecta");
                    incorrecto += 1;
                    System.out.println("no empieza con x y termina con o");
                }
            }
            
        }while(!"&&&&&".equals(cadena));
        
        System.out.println("cadenas correctas " + correcto);
        System.out.println("cadenas incorrectas "+ incorrecto);
    }
    
}