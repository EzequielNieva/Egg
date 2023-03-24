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
public class EJERCICIO_2 {
 static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String datos = cargaDePersonas();
        System.out.println("\nResultados Finales:\n"+datos);
    }

    public static boolean consultaLegalidad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static String cargaDePersonas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int edad;
        String datosGenerales = "";
        
        while (true) {
            System.out.println("Nombre Completo:");
            datosGenerales+="Nombre y Apellido: "+leer.next();
            System.out.println("Ingrese su edad: ");
            edad= leer.nextInt();
            datosGenerales+=" Edad: "+edad;
            datosGenerales+=" Legalidad: ";
            if(consultaLegalidad(edad)){
                datosGenerales+="Mayor\n";
            }else{
                datosGenerales+="Menor\n";
            }
            System.out.println("¿Desea continuar? No=salir");
            if(leer.next().equalsIgnoreCase("no")){
                break;
            }
        }
        return datosGenerales;

    }
      }

