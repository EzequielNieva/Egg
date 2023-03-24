
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
public class EJERCICIO_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase1, frase2 = "";
        System.out.println("Ingrese una frase");
        frase1 = leer.next();
        while (!(frase1.equals("."))) {
            frase2 += frase1;
            System.out.println("Ingrese una frase");
            frase1 = leer.next();
        }
        frase1=frase2;
        frase2 = reemplazarVocales(frase2);
        
        System.out.println("Original: "+frase1);
        System.out.println("Codificada: "+frase2);

    }

    private static String reemplazarVocales(String frase) {
        String codificada = "";

        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1).toLowerCase()) {
                case "a":
                    codificada += "@";
                    break;
                case "e":
                    codificada += "#";
                    break;
                case "i":
                    codificada += "$";
                    break;
                case "o":
                    codificada += "%";
                    break;
                case "u":
                    codificada += "*";
                    break;
                default:
                    codificada += frase.substring(i, i + 1);
                    break;

            }

        }

        return codificada;
    }
    
}
