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
public class EjercicioExtra3 {
  final static int TAMANIO = 15;

    public static void main(String[] args) {
        int[] vector1 = new int[TAMANIO];

        // Llamada al método para cargar el vector
        cargarVector(vector1);

        // Llamada al método para imprimir el vector
        imprimirVector(vector1);
    }

// Método para cargar el vector con números aleatorios
    public static void cargarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9) + 1;
        }
    }

// Método para imprimir el vector en pantalla
    public static void imprimirVector(int[] vector) {
        // Imprime los índices del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(String.format("%6d", i));
        }
        System.out.println("");

        // Imprime los valores del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + String.format("%4d", vector[i]) + "]");
        }
    }

}