
import java.util.Arrays;
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
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int i, num; 
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("¿Cuántos compañeros tienes hoy?");
        num=leer.nextInt();
            
        String[] equipo = new String[num];
        //equipo[0]="Sergio";
        //equipo[1]="Laura";
        //equipo[2]="Lautaro";
        //equipo[3]="Pablo";
        //equipo[4]="Janet";
        
        for (i=0; i<=num-1; i++) {
            System.out.println("INGRESE EL NOMBRE DE UN COMPAÑERO");
            equipo[i]= leer.next(); 
        }
        System.out.println("Hoy, las integrantes que conforman mi equipo son " + Arrays.toString(equipo));
    }
    
}
