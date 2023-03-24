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
public class EJERCICIOEXTRA_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declaramos el objeto leer de la clase Scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        String entrada;
        int cantidadNumeros,i;
        double numero;
        // Inicializar variables para almacenar los valores máximo, mínimo y promedio
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        double suma = 0.0;

        // Pedir al usuario que ingrese la cantidad de números
        cantidadNumeros = 0;
        System.out.print("Ingrese la cantidad de números: ");
        try {
            cantidadNumeros = leer.nextInt();
        } catch (Exception e) {
            System.out.println("El valor ingresado es inválido");
            return;
        }

        // Pedir al usuario que ingrese los n números y realizar los cálculos necesarios
        System.out.println("Ingrese los " + cantidadNumeros + " números:");
        i = 0;
        while (i < cantidadNumeros) {
            while (true) {
                try {
                    System.out.println("Ingrese un número:");
                    entrada = leer.next().replace(',', '.');
                    numero = Double.parseDouble(entrada);
                    break;
                } catch (Exception e) {
                    System.out.print("El valor ingresado es inválido. Intente nuevamente: ");
                }
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
            i++;
        }

        // Calcular el promedio
        double promedio = suma / cantidadNumeros;

        // Mostrar los resultados
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + String.format("%.2f", promedio));

        // Repetir el proceso utilizando el bucle "do-while"
        System.out.println("Ejercicio con bucle do-while:");


        // Pedir al usuario que ingrese la cantidad de números
        cantidadNumeros = 0;
        System.out.print("Ingrese la cantidad de números: ");
        try {
            cantidadNumeros = leer.nextInt();
        } catch (Exception e) {
            System.out.println("El valor ingresado es inválido");
            return;
        }

        // Reiniciar las variables para almacenar los nuevos valores
        maximo = Double.MIN_VALUE;
        minimo = Double.MAX_VALUE;
        suma = 0.0;
        i = 0;


        // Pedir al usuario que ingrese los m números y realizar los cálculos necesarios
        System.out.println("Ingrese los " + cantidadNumeros + " números:");
        do {
            while (true) {
                try {
                    System.out.println("Ingrese un número:");
                    entrada = leer.next().replace(',', '.');
                    numero = Double.parseDouble(entrada);
                    break;
                } catch (Exception e) {
                    System.out.print("El valor ingresado es inválido. Intente nuevamente: ");
                }
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
            i++;
        } while (i < cantidadNumeros);

        // Calcular el promedio
        promedio = suma / cantidadNumeros;

        // Mostrar los resultados
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + String.format("%.2f", promedio));

        // Cerrar el scanner
        leer.close();
    }
}
    

