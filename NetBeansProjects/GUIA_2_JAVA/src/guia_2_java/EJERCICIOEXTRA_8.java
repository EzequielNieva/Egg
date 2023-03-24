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
public class EJERCICIOEXTRA_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Instanciamos un objeto tipo Scanner llamado leer para obtener datos por teclado
        Scanner leer = new Scanner(System.in);

        //Declaramos una variable tipo entero para guardar los valores ingresados por teclado
        int numero1, cantidadLeidos = 0, cantidadPares = 0, cantidadImpares = 0;
        String ingreso;
        //creamos un bucle while para leer números hasta que venga un múltiplo de 5
        while (true) {
            while (true) {
                try {
                    System.out.println("Ingrese un número:");
                    ingreso = leer.next();
                    numero1 = (int) Integer.parseInt(ingreso);
                    if (numero1>=0 || numero1<0) {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("El valor ingresado es inválido.");

                }
            }
            if (numero1 % 5 == 0) {
                break;
            } else {
                if (numero1 > 0) {
                    cantidadLeidos++;
                    if (numero1 % 2 == 0) {
                        System.out.println("El número es par.");
                        cantidadPares++;
                    } else {
                        System.out.println("El número es impar.");
                        cantidadImpares++;
                    }
                }
            }

        }
        System.out.println("La cantidad de números leídos es de: " + cantidadLeidos);
        System.out.println("La cantidad de números pares es de: " + cantidadPares);
        System.out.println("La cantidad de números impares es de: " + cantidadImpares);

    }

}
