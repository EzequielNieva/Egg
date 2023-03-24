/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_java;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra7 {

 // Tamaño del vector que almacenará los elementos de la sucesión de Fibonacci
    static final int TAMANIO = 25;

// Función principal
    public static void main(String[] args) {
        // Se crea un vector de enteros con tamaño TAMANIO
        int[] vectorFibonacci = new int[TAMANIO];
        // Se cargan los elementos de la sucesión de Fibonacci en el vector
        cargarFibonacci(vectorFibonacci);
        // Se imprime el mensaje indicando cuántos elementos se han generado
        System.out.println(TAMANIO + " primeros elementos de la Sucesión Fibonacci:");
        // Se imprime el vector con los elementos generados
        imprimirVector(vectorFibonacci);
    }

// Función que carga los primeros n elementos de la sucesión de Fibonacci en un vector
    public static void cargarFibonacci(int[] fibonacci) {
        // Se recorre el vector
        for (int i = 0; i < fibonacci.length; i++) {
            // Se verifica si es el primer o segundo elemento de la sucesión
            if ((i == 0) || (i == 1)) {
                fibonacci[i] = 1;
            } else {
                // Se calcula el elemento actual de la sucesión como la suma de los dos elementos anteriores
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
    }

// Función que imprime un vector de enteros
    public static void imprimirVector(int[] vector) {
        System.out.print("{");
        // Se recorre el vector
        for (int i = 0; i < vector.length; i++) {
            // Se imprime el elemento actual
            System.out.print(vector[i]);
            // Si no es el último elemento, se imprime una coma y un espacio
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
