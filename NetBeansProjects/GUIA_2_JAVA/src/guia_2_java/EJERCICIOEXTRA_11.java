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
public class EJERCICIOEXTRA_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        long numero1, digitos = 0; // declaramos las variables para el número ingresado y la cantidad de dígitos

        System.out.println("Ingrese un número")                ;
        numero1 = leer.nextLong(); // leemos el número ingresado por el usuario

        if (numero1 == 0) { // si el número ingresado es cero
            digitos = 1; // entonces la cantidad de dígitos es uno
        } else {
            while (numero1 > 0) { // mientras el número ingresado sea mayor que cero
                digitos++; // aumentamos la cantidad de dígitos en uno
                numero1 /= 10; // eliminamos el último dígito del número
            }

        }
        System.out.println("La cantidad de dígitos del número es:" + digitos); // mostramos la cantidad de dígitos del número
        //Cerramos el scanner
        leer.close();
    }

}