/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4_java;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EJERCICIO_4 {

    /**
     * @param args
   
   
     */
 
    public static void main(String[] args) {
        if (consultaPrimo(leerNumeros())) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }

    /**
     *
     * Método para leer un número ingresado por el usuario desde la consola.
     *
     * @return el número ingresado por el usuario
     */
    private static long leerNumeros() {
        Scanner leer = new Scanner(System.in); // Crear objeto Scanner para leer desde la consola
        long num;
        while (true) { // Repetir hasta que se ingrese un número válido
            try {
                System.out.println("Ingrese un número:"); // Pedir al usuario que ingrese un número
                num = leer.nextLong(); // Leer el número ingresado por el usuario
                break; // Salir del bucle while si se ingresó un número válido
            } catch (Exception e) {
                System.out.println("Error: Ingreso Inválido. Intente nuevamente."); // Indicar al usuario que se ingresó un valor inválido
                leer.next(); // Descartar la entrada inválida
            }
        }
        leer.close(); // Cerrar el objeto Scanner
        return num; // Retornar el número ingresado por el usuario
    }

    /**
     *
     * Función para evaluar si un número es Primo.
     *
     * @param num numero a evaluar.
     * @return devuelve verdadero si el número es primo y falso si no lo es.
     */
    private static boolean consultaPrimo(long num) {
        long i = num - 1; // Se inicializa la variable i en num-1 para comenzar a verificar si el número es primo desde el número anterior a él
        if (num <= 1) { // Si el número es menor o igual que 1, no es primo
            return false;
        }

        while (i >= 2) { // Se itera mientras i sea mayor o igual que 2
            if (((num) % i) == 0) { // Si el número es divisible entre i, entonces no es primo
                return false;
            }
            i--; // Se decrementa el valor de i en cada iteración
        }
        return true; // Si no se encontró un divisor del número, entonces es primo
    }

}
