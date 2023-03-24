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
public class EJERCICIOEXTRA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

    	String opcion;
        int num;
    	System.out.println("Ingrese la clase de Socio:");

    	opcion = leer.next().toUpperCase();
        System.out.println("Ingrese el valor");
        num = leer.nextInt();
        	switch (opcion) {
        	case "A":
           System.out.println(0.50*num);
           break;

        	case "B":
           System.out.println(0.65*num);
            break;
                case "C":
           System.out.println(num);
            break;

        	default:
           System.out.println("Valor incorrecto");
    	}
}
    }
    

