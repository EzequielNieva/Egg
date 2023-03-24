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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TAMANIO = 0;
       long[][] matriz1 = new long[TAMANIO][TAMANIO]; // Declaración de la matriz original.
        long[][] matrizTranspuesta = new long[TAMANIO][TAMANIO]; // Declaración de la matriz transpuesta.
        llenarMatrizAleatorio(matriz1); // Llamada al método para llenar la matriz original con valores aleatorios.

        // Recorrido de la matriz transpuesta para asignar los valores de la matriz original.
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                matrizTranspuesta[i][j] = matriz1[j][i]; // Asignación de valor de la matriz original a la transpuesta.
            }
        }

        // Impresión de la matriz original y la matriz transpuesta.
        System.out.println("Matriz original->");
        imprimirMatriz(matriz1);
        System.out.println("Matriz transpuesta->");
        imprimirMatriz(matrizTranspuesta);
    }

    public static void llenarMatrizAleatorio(long[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (long) ((Math.random() * 20) + 1);

            }

        }

    }

    public static void imprimirMatriz(long[][] matriz) {

        System.out.print("    ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + "    ");

        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[");
                if (matriz[i][j] < 10) {
                    System.out.print("  " + matriz[i][j]);
                } else if (matriz[i][j] < 100) {
                    System.out.print(" " + matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j]);
                }
                System.out.print("]");
            }
            System.out.println("");

        }
        System.out.println("\n\n");

    }
}
    

