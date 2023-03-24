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
public class EjercicioExtra4 {

   
    static final int CANT_ALUMNOS = 10;

    public static void main(String[] args) {
        // Se define un arreglo de tamaño CANT_ALUMNOS para guardar las notas finales de los alumnos.
        double[] alumnos = new double[CANT_ALUMNOS];

        // Se cargan las notas finales de los alumnos en el arreglo.
        cargarNotasFinales(alumnos);

        // Se informa la cantidad de aprobados y desaprobados del curso.
        informarAprobadosONo(alumnos);
    }

// Método para pedir y calcular la nota de los prácticos de un alumno.
    private static double notaPracticos() {
        Scanner leer = new Scanner(System.in);
        double notaPracticos = 0;

        // Se pide la nota del primer práctico y se multiplica por el 10% correspondiente.
        System.out.println("Ingrese la nota del primer práctico:");
        notaPracticos += leer.nextDouble() * (0.10);

        // Se pide la nota del segundo práctico y se multiplica por el 15% correspondiente.
        System.out.println("Ingrese la nota del segundo práctico:");
        notaPracticos += leer.nextDouble() * (0.15);

        return notaPracticos;
    }

// Método para pedir y calcular la nota de los parciales de un alumno.
    private static double notaParciales() {
        Scanner leer = new Scanner(System.in);
        double notaParciales = 0;

        // Se pide la nota del primer parcial y se multiplica por el 25% correspondiente.
        System.out.println("Ingrese la nota del primer parcial:");
        notaParciales += leer.nextDouble() * (0.25);

        // Se pide la nota del segundo parcial y se multiplica por el 50% correspondiente.
        System.out.println("Ingrese la nota del segundo parcial:");
        notaParciales += leer.nextDouble() * (0.50);

        return notaParciales;
    }

// Método para cargar las notas finales de los alumnos en un arreglo.
    public static void cargarNotasFinales(double[] planilla) {
        for (int i = 0; i < planilla.length; i++) {
            // Se suman las notas de los prácticos y los parciales para obtener la nota final del alumno.
            planilla[i] = notaPracticos() + notaParciales();
        }
    }

// Método para informar la cantidad de aprobados y desaprobados en el curso.
    public static void informarAprobadosONo(double[] planilla) {
        int total_aprobados = 0;
        int total_desaprobados = 0;

        for (int i = 0; i < planilla.length; i++) {
            // Si la nota final es mayor o igual a 7.00 se cuenta como aprobado, en caso contrario se cuenta como desaprobado.
            if (planilla[i] >= 7.00) {
                total_aprobados++;
            } else {
                total_desaprobados++;
            }
        }

        // Se imprime el detalle con la cantidad de aprobados y desaprobados en el curso.
        System.out.println("Detalle:\nAprobados: " + total_aprobados + "\nDesaprobados: " + total_desaprobados);
    }

}