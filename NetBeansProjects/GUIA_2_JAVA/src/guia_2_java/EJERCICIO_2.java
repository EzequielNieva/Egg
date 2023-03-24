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
public class EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
       String palab; 
        
        System.out.println("Ingrese la clave");
      palab = leer.next();
    if ("eureka".equals(palab)) {
    System.out.println("CORRECTO");
}
    else {
            System.out.println("Incorrecto");
       

}
    }
     }