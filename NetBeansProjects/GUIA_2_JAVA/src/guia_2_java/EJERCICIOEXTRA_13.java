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
public class EJERCICIOEXTRA_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int altura = 0; // variable para guardar la altura de la escalera
        StringBuilder secuencia = new StringBuilder(); // variable para construir la secuencia
        System.out.println("Ingrese la altura de su escalera:");

        // Validar entrada del usuario
        while (altura <= 0) { // mientras la altura no sea un número entero positivo mayor que cero
            try {
                altura = leer.nextInt(); // intentar leer un entero desde la entrada del usuario
                if (altura <= 0) { // si la altura es menor o igual a cero
                    System.out.println("La altura debe sermayor que cero. Inténtalo de nuevo:"); // imprimir mensaje de error
                }
            } catch (Exception e) { // si la entrada no es un entero
                System.out.println("Ingreso inválido, debe ingresar un número positivo mayor a 0.\n"
                        + "Inténtalo de nuevo:"); // imprimir mensaje de error
                leer.next(); // descartar la entrada no válida
            }
        }

        // Construir la secuencia
        for (int i = 1; i <= altura; i++) { // para cada número desde 1 hasta la altura ingresada por el usuario
            secuencia.append(i); // agregar el número a la secuencia
            System.out.println(secuencia.toString()); // imprimir la secuencia actual
        }

        leer.close(); // cerrar el objeto Scanner
    }
}
