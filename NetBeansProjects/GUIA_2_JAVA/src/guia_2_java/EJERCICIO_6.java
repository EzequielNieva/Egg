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
public class EJERCICIO_6 {
    
    
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        String respuesta;
        Boolean bandera = true;
        
     System.out.println("Ingrese un numero entero");
        double num1 = leer.nextInt();
        
     System.out.println("Ingrese un numero entero");
        double num2 = leer.nextInt();
        
        do {
        System.out.println("Eliga una opcion, 1-sumar, 2-restar, 3-multiplicar, 4-dividir, 5-salir");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println("quiere salir (s/n)?");
                respuesta = leer.next();
                if(respuesta.equals("s")){
                    bandera = false;
                    System.out.println(bandera);
                    break;
                 
                }
                //System.out.println(bandera);
        }
        }while(bandera);
    }
    
}
