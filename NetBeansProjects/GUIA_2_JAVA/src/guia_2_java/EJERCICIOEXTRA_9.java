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
public class EJERCICIOEXTRA_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Usamos leer de tipo Scanner y lo instanciamos
        Scanner leer = new Scanner(System.in);

        //Declaramos variables tipo entero para guardar los valores de la division
        int dividendo,dividendoAux,divisor,cociente=0,resto;

        System.out.println("Ingrese un valor para el dividendo");
        dividendo = leer.nextInt();
        dividendoAux = dividendo;
        System.out.println("Ingrese un valor para el divisor");
        divisor = leer.nextInt();

        while(true){
            resto=dividendo-divisor;
            cociente++;
            dividendo=dividendo-divisor;
            if(resto<divisor){
                break;
            }


        }
        resto=dividendo;
        System.out.println("Dividendo:"+dividendoAux+"\nDivisor:"+divisor+"\nCociente:"+cociente+"\nResto:"+resto);

        //Cerramos el Scanner
        leer.close();

    }

}
