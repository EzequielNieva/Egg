
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
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("");
        Scanner leer = new Scanner(System.in);
        int nro;
        String ast = "";
        
        for(int i=1;i<=4;i++)  {
            System.out.print("Ing un nro: ");
            nro = leer.nextInt();
            System.out.println();
            if ((nro<0) || (nro>20)){
                i--;
                System.out.println("Nro incorrecto (de 1 a 20) : ");
                continue;
            }
            for(int j=1;j<=nro;j++) {
                ast = ast + "*";
            }
            System.out.println(nro + " "+ast);
            ast = "";
        }
        
        
    }
}

    

