/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_java;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector:");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];  // Crear un arreglo de enteros del tamaño especificado por el usuario
        int totalVector = 0;  // Inicializar una variable para almacenar la suma de los elementos del vector

        for (int i = 0; i < vector.length; i++) {  // Recorrer el arreglo y pedir al usuario que ingrese cada elemento
            System.out.println("Ingrese un valor a cargar:(" + (i + 1) + "/" + vector.length + ")");
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {  // Recorrer el arreglo y sumar los elementos
            totalVector += vector[i];
        }

        System.out.println("La suma total del vector es de: " + totalVector);  // Imprimir la suma total del vector
    }

}
    
    

