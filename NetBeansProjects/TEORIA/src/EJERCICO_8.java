
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
public class EJERCICO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.print("Ing valor de nota (0 a 10): ");
        int nota = leer.nextInt();
        
        while ((nota<0) || (nota>10)) {
            System.out.println("NOTA INCORRECTA - REINGRESE");
            System.out.print("Ing valor de nota (0 a 10): ");
            nota = leer.nextInt();
        }
        
        System.out.println("NOTA CORRECTA: "+nota);
        
    }
    }
    

