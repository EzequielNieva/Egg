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
public class EJERCICIOEXTRA_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);

        // Generar dos números aleatorios entre 0 y 10
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        // Calcular el resultado de la multiplicación
        int resultado = num1 * num2;

        System.out.println("Adivine el resultado de la siguiente multiplicación:");
        System.out.print(num1 + " x " + num2 + " = ");

        // Leer la respuesta del usuario
        int respuesta = leer.nextInt();

        // Mientras la respuesta sea incorrecta, pedir al usuario que ingrese de nuevo
        while (respuesta != resultado) {
            System.out.println("Respuesta incorrecta. Intente de nuevo.");
            System.out.print(num1 + " x " + num2 + " = ");
            respuesta = leer.nextInt();
        }

        // Si la respuesta es correcta, mostrar un mensaje de felicitación
        System.out.println("¡Correcto! Felicitaciones.");

        //Cerramos el Scanner
        leer.close();
    }
}
