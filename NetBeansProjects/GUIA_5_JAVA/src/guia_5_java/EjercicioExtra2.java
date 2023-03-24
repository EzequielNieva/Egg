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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TAMANIO = 0;
  int[] vector1 = new int[TAMANIO];  // Crear un arreglo de enteros del tamaño especificado por la constante
        int[] vector2 = new int[TAMANIO];  // Crear otro arreglo de enteros del mismo tamaño
        boolean iguales = true;  // Inicializar una variable booleana para almacenar si los vectores son iguales o no

        for (int i = 0; i < vector1.length; i++) {  // Recorrer ambos vectores y asignarles el mismo valor
            vector1[i] = i;
            vector2[i] = i;
        }

        if (vector1.length == vector2.length) {  // Verificar si los vectores tienen el mismo tamaño
            for (int i = 0; i < vector1.length; i++) {  // Recorrer ambos vectores y comparar cada elemento
                if (vector1[i] != vector2[i]) {  // Si algún elemento es diferente, los vectores no son iguales
                    iguales = false;
                    break;
                }
            }
        } else {  // Si los vectores no tienen el mismo tamaño, no pueden ser iguales
            iguales = false;
        }

        if (iguales) {  // Si los vectores son iguales, imprimir un mensaje indicándolo
            System.out.println("Los vectores son iguales");
        } else {  // Si los vectores no son iguales, imprimir un mensaje indicándolo
            System.out.println("Los vectores son distintos");
        }
    }

}