
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
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ing un Nro entre 1 y 4");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Es una bomba de agua");
                break;
            case 2:
                System.out.println("Es una bomba de gasolina");
                break;
            case 3:
                System.out.println("Es una bomba de hormigón");
                break;
            case 4:
                System.out.println("Es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                //throw new AssertionError();
        } 
    }
}
 
    

