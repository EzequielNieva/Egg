
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ezequiel
 */
public class EJERCICIO_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num_1;
        int acum = 0;
        int cont = 0;
        
        do {            
            System.out.println("Ing un Nro");
            num_1 = leer.nextInt();
            if (num_1>0) {
                acum = acum + num_1;
            }
            if (num_1==0) {
                break;
            }
            cont = cont + 1;
           
        } while (cont<20);
        System.out.println("La suma de los números ingresados es: "+acum);
    }
 }

    
