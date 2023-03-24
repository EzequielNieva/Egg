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
public class EJERCICIOEXTRA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String y;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena de maximo 5 caracteres");
            y= leer.nextLine();
      if ("e".equals(y)|| "a".equals(y)||"i".equals(y)||"o".equals(y)||"u".equals(y))
            System.out.println("Es vocal");
      else 
            System.out.println("Es consonante");
}
    }
